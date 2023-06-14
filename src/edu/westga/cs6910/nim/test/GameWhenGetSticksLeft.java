package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;

class GameWhenGetSticksLeft {

	@Test
	void testNewGameGetSticksLeft() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		assertEquals(7, game.getSticksLeft());		
	}
	
	@Test
	void testGetSticksLeftAfterTurn() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		
		game.startNewGame(computer);
		computer.setPileForThisTurn(game.getPile());
		computer.setSticksToTake(2);
		game.play();
		
		assertEquals(5, game.getSticksLeft());		
	}
	
	@Test
	void testGetSticksLeftAtEndOfGame() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		
		game.startNewGame(computer);
		computer.setPileForThisTurn(game.getPile());
		computer.setSticksToTake(6);
		game.play();
		
		assertEquals(1, game.getSticksLeft());		
	}

}
