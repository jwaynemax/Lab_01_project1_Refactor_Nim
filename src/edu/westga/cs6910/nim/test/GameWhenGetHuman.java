package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class GameWhenGetHuman {

	@Test
	void  testGetHumanPlayerWhenNewGame() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		
		assertEquals("Human", game.getHumanPlayer().getName());		
	}
	
	@Test
	void  testGetHumanPlayerSticksToTake() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
				
		assertEquals(0, game.getHumanPlayer().getSticksToTake());		
	}
	
	@Test
	void  testSetPileSizeFromGameForHumanPlayere() {
		ComputerPlayer computer = new ComputerPlayer();
		HumanPlayer human = new HumanPlayer("Human");
		Game game = new Game(human, computer);
		Pile pile = new Pile(7);
		human.setThePile(pile);
				
		assertEquals("Pile size: 7", game.getHumanPlayer().getThePile().toString());		
	}

}
