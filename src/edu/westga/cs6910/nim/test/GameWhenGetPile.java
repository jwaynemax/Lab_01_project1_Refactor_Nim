package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;

class GameWhenGetPile {

	@Test
	void testNewGameGetPileSize() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		assertEquals("Pile size: 7", game.getPile().toString());		
	}
	
	@Test
	void testGetPileSizeAfterTurn() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		
		game.startNewGame(computer);
		computer.setPileForThisTurn(game.getPile());
		computer.setSticksToTake(2);
		game.play();
		
		assertEquals("Pile size: 5", game.getPile().toString());		
	}
	
	@Test
	void testGetPileSizeAtEndOfGame() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		
		game.startNewGame(computer);
		computer.setPileForThisTurn(game.getPile());
		computer.setSticksToTake(6);
		game.play();
		
		assertEquals(true, game.isGameOver());		
	}
}
