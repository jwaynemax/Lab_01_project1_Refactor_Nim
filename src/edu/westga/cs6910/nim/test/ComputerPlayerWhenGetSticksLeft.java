package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

class ComputerPlayerWhenGetSticksLeft {

	@Test
	void testNewComputerPlayerGetSticksLeft() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Pile pile = new Pile(7);
		computer.setThePile(pile);
		assertEquals(7, computer.getSticksLeft());
	}
	
	@Test
	void testComputerPlayerGetSticksLeftAfterTurn() {
		HumanPlayer human = new HumanPlayer("Human");
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Game game = new Game(human, computer);
		Pile pile = new Pile(7);
		
		game.startNewGame(computer);
		game.getComputerPlayer().setThePile(pile);
		game.getComputerPlayer().setSticksToTake(2);
		game.play();
		
		assertEquals(5, game.getComputerPlayer().getSticksLeft());
	}
	
	@Test
	void testComputerPlayerGetSticksLeftWithNoParamNumberSticksToTake() {
		HumanPlayer human = new HumanPlayer("Human");
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Game game = new Game(human, computer);
		Pile pile = new Pile(7);
		
		game.startNewGame(computer);
		game.getComputerPlayer().setThePile(pile);
		game.getComputerPlayer().setNumberSticksToTake();
		game.play();
		
		assertEquals(6, game.getComputerPlayer().getSticksLeft());
	}

}
