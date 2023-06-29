package edu.westga.cs6910.nim.view;

import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.Player;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;
import edu.westga.cs6910.nim.model.strategy.GreedyStrategy;
import edu.westga.cs6910.nim.model.strategy.RandomStrategy;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * Defines a GUI for the 1-pile Nim game. This class was started by CS6910
 * 
 * @author Justin Maxwell
 * @version Summer 2023
 */
public class NimPane extends BorderPane {
	private Game theGame;
	private BorderPane pnContent;
	private HumanPane pnHumanPlayer;
	private ComputerPane pnComputerPlayer;
	private StatusPane pnGameInfo;
	private Pane pnChooseFirstPlayer;
	private BorderPane menuPane;

	/**
	 * Creates a pane object to provide the view for the specified Game model
	 * object.
	 * 
	 * @param theGame the domain model object representing the Nim game
	 * 
	 * @requires theGame != null
	 * @ensures the pane is displayed properly
	 */
	public NimPane(Game theGame) {
		this.theGame = theGame;
		this.menuPane = new BorderPane();
		this.createMenu();

		this.pnContent = new BorderPane();
		this.addFirstPlayerChooserPane(theGame);

		HBox leftBox = new HBox();
		leftBox.getStyleClass().add("pane-border");
		this.pnHumanPlayer = new HumanPane(theGame);
		leftBox.getChildren().add(this.pnHumanPlayer);
		this.pnContent.setLeft(leftBox);

		HBox centerBox = new HBox();
		centerBox.getStyleClass().add("pane-border");
		this.pnGameInfo = new StatusPane(theGame);
		centerBox.getChildren().add(this.pnGameInfo);
		this.pnContent.setCenter(centerBox);

		HBox rightBox = new HBox();
		rightBox.getStyleClass().add("pane-border");
		this.pnComputerPlayer = new ComputerPane(theGame);
		rightBox.getChildren().add(this.pnComputerPlayer);
		this.pnContent.setRight(rightBox);

		this.setCenter(this.pnContent);
		this.menuPane.setCenter(this.pnContent);
		this.setCenter(this.menuPane);
	}

	private void addFirstPlayerChooserPane(Game theGame) {
		HBox topBox = new HBox();
		topBox.getStyleClass().add("pane-border");
		this.pnChooseFirstPlayer = new NewGamePane(theGame);
		topBox.getChildren().addAll(this.pnChooseFirstPlayer);
		this.pnContent.setTop(topBox);
	}

	/**
	 * create a menu to exit the game and select the computer's strategy
	 */
	private void createMenu() {
		MenuBar menuBar = new MenuBar();
		Menu game = new Menu("_Game");
		Menu strategy = new Menu("_Strategy");
		game.setMnemonicParsing(true);
		strategy.setMnemonicParsing(true);

		MenuItem exit = new MenuItem("E_xit");
		exit.setMnemonicParsing(true);
		exit.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
		exit.setOnAction(new CloseApp());

		MenuItem cautious = new MenuItem("_Cautious");
		cautious.setMnemonicParsing(true);
		cautious.setAccelerator(new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN));
		cautious.setOnAction(new CautiousComputerListner());

		MenuItem greedy = new MenuItem("Gr_eedy");
		greedy.setMnemonicParsing(true);
		greedy.setAccelerator(new KeyCodeCombination(KeyCode.E, KeyCombination.CONTROL_DOWN));
		greedy.setOnAction(new GreedyComputerListner());

		MenuItem random = new MenuItem("_Random");
		random.setMnemonicParsing(true);
		random.setAccelerator(new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_DOWN));
		random.setOnAction(new RandomComputerListner());

		game.getItems().addAll(exit);
		strategy.getItems().addAll(cautious, greedy, random);
		menuBar.getMenus().addAll(game, strategy);

		this.menuPane.setTop(menuBar);
	}

	/*
	 * Defines the listener to exit the game.
	 */
	private class CloseApp implements EventHandler<ActionEvent> {
		/*
		 * exits the game
		 */
		@Override
		public void handle(ActionEvent event) {
			System.exit(0);
		}
	}

	/*
	 * Defines the listener to set strategy to cautious.
	 */
	private class CautiousComputerListner implements EventHandler<ActionEvent> {
		/*
		 * Sets strategy to cautious
		 */

		@Override
		public void handle(ActionEvent event) {
			CautiousStrategy strategy = new CautiousStrategy();
			NimPane.this.theGame.getComputerPlayer().setStrategy(strategy);
		}
	}

	/*
	 * Defines the listener to set strategy to Greedy.
	 */
	private class GreedyComputerListner implements EventHandler<ActionEvent> {
		/*
		 * Sets strategy to Greedy
		 */

		@Override
		public void handle(ActionEvent event) {
			GreedyStrategy strategy = new GreedyStrategy();
			NimPane.this.theGame.getComputerPlayer().setStrategy(strategy);
		}
	}

	/*
	 * Defines the listener to set strategy to Random.
	 */
	private class RandomComputerListner implements EventHandler<ActionEvent> {
		/*
		 * Sets strategy to Random
		 */

		@Override
		public void handle(ActionEvent event) {
			RandomStrategy strategy = new RandomStrategy();
			NimPane.this.theGame.getComputerPlayer().setStrategy(strategy);
		}
	}

	/*
	 * Defines the panel in which the user selects which Player plays first.
	 */
	private final class NewGamePane extends GridPane {
		private RadioButton radHumanPlayer;
		private RadioButton radComputerPlayer;
		private RadioButton radRandomPlayer;

		private Game theGame;
		private Player theHuman;
		private Player theComputer;

		private NewGamePane(Game theGame) {
			this.theGame = theGame;

			this.theHuman = this.theGame.getHumanPlayer();
			this.theComputer = this.theGame.getComputerPlayer();
			this.buildPane();
		}

		private void buildPane() {
			this.setHgap(20);

			this.radHumanPlayer = new RadioButton(this.theHuman.getName() + " first ");

			this.radComputerPlayer = new RadioButton(this.theComputer.getName() + " first");
			
			this.radRandomPlayer = new RadioButton("Random first player");
			
			ToggleGroup tg = new ToggleGroup();
			this.radHumanPlayer.setToggleGroup(tg);
			this.radComputerPlayer.setToggleGroup(tg);
			this.radRandomPlayer.setToggleGroup(tg);

			this.add(this.radHumanPlayer, 0, 0);
			this.add(this.radComputerPlayer, 1, 0);
			this.add(this.radRandomPlayer, 2, 0);

			this.getFirstPlayer();
		}

		public void getFirstPlayer() {
			if (NimPane.this.theGame.getFirstPlayer() != null && NimPane.this.theGame.getFirstPlayer().equals("computer")) {
				this.radComputerPlayer.setSelected(true);
					ComputerFirstListener computerFirstListener = new ComputerFirstListener();
					computerFirstListener.handle(null);
			} else if (NimPane.this.theGame.getFirstPlayer() != null && NimPane.this.theGame.getFirstPlayer().equals("human")) {
				this.radHumanPlayer.setSelected(true);
				NimPane.this.theGame.getStage().setOnShown(event -> {
					HumanFirstListener humanFirstListener = new HumanFirstListener();
					humanFirstListener.handle(null);
				});
			} else if (NimPane.this.theGame.getFirstPlayer() != null && NimPane.this.theGame.getFirstPlayer().equals("random")) {
				this.radRandomPlayer.setSelected(true);
				NimPane.this.theGame.getStage().setOnShown(event -> {
					RandomFirstListener randomFirstListener = new RandomFirstListener();
					randomFirstListener.handle(null);
				});
			} else {
				this.radHumanPlayer.setOnAction(event -> {
					NimPane.this.theGame.setFirstPlayer("human");
					HumanFirstListener humanFirstListener = new HumanFirstListener();
					humanFirstListener.handle(null);
				});
				this.radComputerPlayer.setOnAction(event -> {
					NimPane.this.theGame.setFirstPlayer("computer");
					ComputerFirstListener computerFirstListener = new ComputerFirstListener();
					computerFirstListener.handle(null);
				});
				this.radRandomPlayer.setOnAction(event -> {
					NimPane.this.theGame.setFirstPlayer("random");
					RandomFirstListener randomFirstListener = new RandomFirstListener();
					randomFirstListener.handle(null);
				});
			}
		
		}
		
		private void randomFirstPlayer() {
			int randomNumber = (int) (Math.random() * (2 - 1 + 1)) + 1;

			if (randomNumber == 1) {
				this.radComputerPlayer.setSelected(true);
				NimPane.this.theGame.getStage().setOnShown(event -> {
					ComputerFirstListener computerFirstListener = new ComputerFirstListener();
					computerFirstListener.handle(null);
				});

			} else {
				this.radHumanPlayer.setSelected(true);
				NimPane.this.theGame.getStage().setOnShown(event -> {
					HumanFirstListener humanFirstListener = new HumanFirstListener();
					humanFirstListener.handle(null);
				});
			}
		}

		/*
		 * Defines the listener for computer player first button.
		 */
		private class ComputerFirstListener implements EventHandler<ActionEvent> {
			@Override
			/**
			 * Enables the ComputerPlayerPanel and starts a new game. Event handler for a
			 * click in the computerPlayerButton.
			 */
			public void handle(ActionEvent arg0) {
				NimPane.this.pnComputerPlayer.setDisable(false);
				NimPane.this.pnChooseFirstPlayer.setDisable(true);
				NimPane.this.theGame.startNewGame(NewGamePane.this.theComputer);
			}
		}

		/*
		 * Defines the listener for human player first button.
		 */
		private class HumanFirstListener implements EventHandler<ActionEvent> {
			/*
			 * Sets up user interface and starts a new game. Event handler for a click in
			 * the human player button.
			 */
			@Override
			public void handle(ActionEvent event) {
				NimPane.this.pnChooseFirstPlayer.setDisable(true);
				NimPane.this.pnHumanPlayer.setDisable(false);
				NimPane.this.theGame.startNewGame(NewGamePane.this.theHuman);
			}
		}
		
		/*
		 * Defines the listener for random first player button.
		 */
		private class RandomFirstListener implements EventHandler<ActionEvent> {
			@Override
			/**
			 * Randomly select which player will go first.
			 */
			public void handle(ActionEvent arg0) {
				int randomNumber = (int) (Math.random() * (2 - 1 + 1)) + 1;
				if (randomNumber == 1) {
					ComputerFirstListener computerFirstListener = new ComputerFirstListener();
					computerFirstListener.handle(null);

				} else {
					HumanFirstListener humanFirstListener = new HumanFirstListener();
					humanFirstListener.handle(null);
				}

			}
		}

	}
}
