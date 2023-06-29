package edu.westga.cs6910.nim.controllers;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;
import edu.westga.cs6910.nim.view.NimPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Driver for the application. Creates the GUI and shows it.
 * 
 * @author Justin Maxwell
 * @version Summer 2023
 *
 */
public class Main extends Application {
	private String firstPlayer;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("CS6910: Simple Nim");

		CautiousStrategy strategy = new CautiousStrategy();
		Game theGame = new Game(new HumanPlayer("Human"), new ComputerPlayer(strategy));
		theGame.setStage(primaryStage);

		if (this.firstPlayer != null) {
			theGame.setFirstPlayer(this.firstPlayer);
		}

		NimPane root = new NimPane(theGame);
		Scene scene = new Scene(root, 700, 200);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Setter to set firstPlayer in Game class
	 * 
	 * @param firstPlayer to set firstPlayer field
	 */
	public void setFirstPlayer(String firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	/**
	 * Entry point into the application
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
