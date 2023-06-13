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
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		Pile pile = new Pile(0);
		
		computer.setPileForThisTurn(pile);
		
		System.out.println(game.getPile());
		
		assertEquals(true, game.isGameOver());		
	}

}
