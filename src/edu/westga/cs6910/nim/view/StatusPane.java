package edu.westga.cs6910.nim.view;

import edu.westga.cs6910.nim.controllers.Main;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.Player;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Defines the panel that displays either the number of sticks left on the
 * pile or the winner if the game is over.
 * 
 * @author CS6910
 * @version Summer 2023
 */
public class StatusPane extends GridPane implements InvalidationListener {
	private Game theGame;
	private Label lblStatus;
	private Button btnRestartGame;
	
	/**
	 * Creates a new status pane that observes the specified game. 
	 * 
	 * @param theGame	the model object from which this pane gets its data
	 * 
	 * @requires 	theGame != null
	 */
	public StatusPane(Game theGame) {
		this.theGame = theGame;
		
		this.theGame.addListener(this);
		
		this.buildPane();
	}

	private void buildPane() {
		this.add(new Label("~~ Game Info ~~"), 0, 0);
		
		this.lblStatus = new Label(this.theGame.toString());
		this.add(this.lblStatus, 0, 1);
	}
	
	private void restartGame() {
		this.btnRestartGame = new Button("Restart");
		this.btnRestartGame.setOnAction(new RestartGameListner());
		this.add(this.btnRestartGame, 0, 2);
	}

	@Override
	public void invalidated(Observable observable) {
		this.lblStatus.setText(this.theGame.toString());
		if (this.theGame.isGameOver()) {
			this.restartGame();
		}
	}
	
	/* 
	 * Defines the listener for btnRestartGame.
	 */
	private class RestartGameListner implements EventHandler<ActionEvent> {

		/* 
		 * Tells the Game to close the current stage, then create a new Game from Main
		 * 
		 * @see javafx.event.EventHandler#handle(T-extends-javafx.event.Event)
		 */
		@Override
		public void handle(ActionEvent arg0) {
			Player player = StatusPane.this.theGame.getFirstPlayer();
			StatusPane.this.theGame.getStage().close();
			Stage stage = new Stage();
			Main main = new Main();
			main.setFirstPlayer(player);
			main.start(stage);
		}
	}
}
