package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;

class GameWhenStartNewGame {

	@Test
	void  testStartingANewGameWithHumanAsCurrentPlayer() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		game.startNewGame(human);
		
		assertEquals("Human", game.getCurrentPlayer().getName());		
	}
	
	@Test
	void  testStartingANewGameWithComputerAsCurrentPlayer() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		game.startNewGame(computer);
		
		assertEquals("Simple computer", game.getCurrentPlayer().getName());		
	}
	
	@Test
	void  testGetStartingPile() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		game.startNewGame(computer);
		
		assertEquals("Pile size: 7", game.getPile().toString());		
	}

}
