package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class GameWhenGetIsGameOver {

	@Test
	void  testBeforeGameStartsIsNotOver() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		assertEquals(false, game.isGameOver());		
	}
	
	@Test
	void  testGameIsOver() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		
		game.startNewGame(computer);
		computer.setPileForThisTurn(game.getPile());
		computer.setSticksToTake(6);
		game.play();		
		
		assertEquals(true, game.isGameOver());		
	}

	@Test
	void  testGameIsOverToString() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		
		game.startNewGame(computer);
		computer.setPileForThisTurn(game.getPile());
		computer.setSticksToTake(6);
		game.play();		
				
		assertEquals("Game over! Winner: Simple computer", game.toString());		
	}

}
