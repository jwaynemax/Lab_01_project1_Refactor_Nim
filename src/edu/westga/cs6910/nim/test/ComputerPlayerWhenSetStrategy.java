package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.GreedyStrategy;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class ComputerPlayerWhenSetStrategy {

	@Test
	void testSetStrategyToCautious() {
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
	
	@Test
	void testSetStrategyToGreedy() {
		HumanPlayer human = new HumanPlayer("Human");
		GreedyStrategy strategy = new GreedyStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Game game = new Game(human, computer);
		Pile pile = new Pile(7);
		
		game.startNewGame(computer);
		game.getComputerPlayer().setThePile(pile);
		game.getComputerPlayer().setNumberSticksToTake();
		game.play();
		
		assertEquals(1, game.getComputerPlayer().getSticksLeft());
	}
	
	@Test
	void testSetStrategyToCautiousWithPileSize8() {
		HumanPlayer human = new HumanPlayer("Human");
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Game game = new Game(human, computer);
		Pile pile = new Pile(8);
		
		game.startNewGame(computer);
		game.getComputerPlayer().setThePile(pile);
		game.getComputerPlayer().setNumberSticksToTake();
		game.play();
		
		assertEquals(7, game.getComputerPlayer().getSticksLeft());
	}

}
