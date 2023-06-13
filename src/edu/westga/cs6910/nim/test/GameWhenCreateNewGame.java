package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;

class GameWhenCreateNewGame {

	@Test
	void testNewGameGetHuman() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		assertEquals("Human", game.getHumanPlayer().getName());		
	}
	
	@Test
	void testNewGameGetComputer() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		assertEquals("Simple computer", game.getComputerPlayer().getName());		
	}
	
	@Test
	void testNewGameGetPileSize() {
		HumanPlayer human = new HumanPlayer("Human");
		ComputerPlayer computer = new ComputerPlayer();
		Game game = new Game(human, computer);
		
		assertEquals("Pile size: 7", game.getPile().toString());		
	}

}
