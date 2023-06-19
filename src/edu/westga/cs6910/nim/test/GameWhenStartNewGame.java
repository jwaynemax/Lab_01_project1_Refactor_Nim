package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;

class GameWhenStartNewGame {

	@Test
	void  testStartingANewGameWithHumanAsCurrentPlayer() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		game.startNewGame(human);
		
		assertEquals("Human", game.getCurrentPlayer().getName());		
	}
	
	@Test
	void  testStartingANewGameWithComputerAsCurrentPlayer() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		game.startNewGame(computer);
		
		assertEquals("Simple computer", game.getCurrentPlayer().getName());		
	}
	
	@Test
	void  testGetStartingPile() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		game.startNewGame(computer);
		
		assertEquals("Pile size: 7", game.getPile().toString());		
	}

}
