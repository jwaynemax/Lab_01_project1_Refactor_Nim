package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

class CautiousStrategyWhenHowManySticksShouldBe1 {

	@Test
	void testCautiousStrategyWithPileSize7() {
		CautiousStrategy strategy = new CautiousStrategy();	
		assertEquals(1, strategy.howManySticks(7));
	}
	
	@Test
	void testCautiousStrategyThrowErrorWithPileSize0() {
		CautiousStrategy strategy = new CautiousStrategy();	
		
		assertThrows(IllegalArgumentException.class, () -> {
			strategy.howManySticks(0);
		});
		
	}
	
	@Test
	void testCautiousStrategyWithPileSize2() {
		CautiousStrategy strategy = new CautiousStrategy();	
		assertEquals(1, strategy.howManySticks(2));
	}

}
