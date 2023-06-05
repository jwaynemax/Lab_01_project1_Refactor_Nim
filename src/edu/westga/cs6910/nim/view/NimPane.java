package edu.westga.cs6910.nim.view;

import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * Defines a GUI for the 1-pile Nim game.
 * This class was started by CS6910
 * 
 * @author Justin Maxwell
 */
public class NimPane extends BorderPane {
	private Game theGame;
	private BorderPane pnContent;
	private HumanPane pnHumanPlayer;
	private ComputerPane pnComputerPlayer;
	private StatusPane pnGameInfo;
	private Pane pnChooseFirstPlayer;
	
	/**
	 * Creates a pane object to provide the view for the specified
	 * Game model object.
	 * 
	 * @param theGame	the domain model object representing the Nim game
	 * 
	 * @requires theGame != null
	 * @ensures	 the pane is displayed properly
	 */
	public NimPane(Game theGame) {
		this.theGame = theGame;
		
		this.pnContent = new BorderPane();
		
		this.addFirstPlayerChooserPane(theGame);		
		
		//DONE
		// TODO: 1. Using the 'first player chooser pane' as a guide
		//			Create an HBox with the appropriate style, then
		//			make a human player pane and add it to the HBox.
		//			Finally add the HBox to the content pane	
		HBox leftBox = new HBox();
		leftBox.getStyleClass().add("pane-border");
		this.pnHumanPlayer = new HumanPane(theGame);
		leftBox.getChildren().add(this.pnHumanPlayer);
		this.pnContent.setLeft(leftBox);
		
		//DONE
		// TODO: 2. Using the other panes as a guide, create
		//			and add a status pane
		
		HBox centerBox = new HBox();
		centerBox.getStyleClass().add("pane-border");
		this.pnGameInfo = new StatusPane(theGame);
		centerBox.getChildren().add(this.pnGameInfo);
		this.pnContent.setCenter(centerBox);

		//DONE
		// TODO: 3. Using the other panes as a guide, create
		//			and add a computer pane
		
		HBox rightBox = new HBox();
		rightBox.getStyleClass().add("pane-border");
		this.pnComputerPlayer = new ComputerPane(theGame);
		rightBox.getChildren().add(this.pnComputerPlayer);
		this.pnContent.setRight(rightBox);

		this.setCenter(this.pnContent);
	}

	private void addFirstPlayerChooserPane(Game theGame) {
		HBox topBox = new HBox();
		topBox.getStyleClass().add("pane-border");	
		this.pnChooseFirstPlayer = new NewGamePane(theGame);
		topBox.getChildren().add(this.pnChooseFirstPlayer);
		this.pnContent.setTop(topBox);
	}

	/*
	 * Defines the panel in which the user selects which Player plays first.
	 */
	private final class NewGamePane extends GridPane {
		private RadioButton radHumanPlayer;
		private RadioButton radComputerPlayer;
		
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
			
			this.radHumanPlayer = new RadioButton(this.theHuman.getName() + " first");	
			this.radHumanPlayer.setOnAction(new HumanFirstListener());
			
			//DONE
			// TODO: Instantiate the computer player button and set 
			//		its action listener.
			this.radComputerPlayer = new RadioButton(this.theComputer.getName() + " first");	
			this.radComputerPlayer.setOnAction(new ComputerFirstListener());
			
			//DONE
			// TODO: Create a ToggleGroup and add the 2 radio buttons to it.
			ToggleGroup tg = new ToggleGroup();
			this.radHumanPlayer.setToggleGroup(tg);
			this.radComputerPlayer.setToggleGroup(tg);
			
			//DONE
			// TODO: Add the 2 radio buttons to this pane.
			this.add(this.radHumanPlayer, 0,0);
			this.add(this.radComputerPlayer, 1, 0);
		}
		
		/* 
		 * Defines the listener for computer player first button.
		 */		
		private class ComputerFirstListener implements EventHandler<ActionEvent> {
			@Override
			/** 
			 * Enables the ComputerPlayerPanel and starts a new game. 
			 * Event handler for a click in the computerPlayerButton.
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
			 * Sets up user interface and starts a new game. 
			 * Event handler for a click in the human player button.
			 */
			@Override
			public void handle(ActionEvent event) {
				NimPane.this.pnChooseFirstPlayer.setDisable(true);
				//DONE
				// TODO: Enable the human player pane and start a game
				//		 with the human playing first.
				NimPane.this.pnHumanPlayer.setDisable(false);
				NimPane.this.theGame.startNewGame(NewGamePane.this.theHuman);
			}
		}
	}
}
