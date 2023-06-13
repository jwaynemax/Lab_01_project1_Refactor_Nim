package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class GameWhenGetComputer {

	@Test
	void  testGetComputerPlayerWhenNewGame() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		assertEquals("Simple computer", game.getComputerPlayer().getName());		
	}
	
	@Test
	void  testGeComputerPlayerSticksToTake() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
				
		assertEquals(0, game.getComputerPlayer().getSticksToTake());		
	}
	
	@Test
	void  testSetPileSizeFromGameForComputerPlayere() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		Pile pile = new Pile(7);
		computer.setThePile(pile);
				
		assertEquals("Pile size: 7", game.getComputerPlayer().getThePile().toString());		
	}

}
