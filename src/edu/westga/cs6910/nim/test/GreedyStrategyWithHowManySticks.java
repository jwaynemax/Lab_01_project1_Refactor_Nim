package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.GreedyStrategy;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class GreedyStrategyWithHowManySticks {

	
	@Test
	void testGreedyStrategyWithPileSize7() {
		CautiousStrategy strategy = new CautiousStrategy();	
		assertEquals(1, strategy.howManySticks(7));
	}
	
	@Test
	void testGreedyStrategyThrowErrorWithPileSize0() {
		CautiousStrategy strategy = new CautiousStrategy();	
		
		assertThrows(IllegalArgumentException.class, () -> {
			strategy.howManySticks(0);
		});
	}
	
	@Test
	void testGreedyStrategyWithPileSize2() {
		CautiousStrategy strategy = new CautiousStrategy();	
		
		assertEquals(1, strategy.howManySticks(2));
	}
	
}
