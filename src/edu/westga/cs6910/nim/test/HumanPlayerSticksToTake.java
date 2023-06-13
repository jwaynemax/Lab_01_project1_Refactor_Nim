package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;

class HumanPlayerSticksToTake {

	@Test
	void testSticksToTakeParam1() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");	
		humanPlayer.setNumberSticksToTake(1);
		assertEquals(1, humanPlayer.getSticksToTake());
	}
	
	@Test
	void testNewHumanPlayerSticksToTake() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");	
		assertEquals(0, humanPlayer.getSticksToTake());
	}
	
	@Test
	void testNewHumanPlayerSticksToTak1000() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");	
		humanPlayer.setSticksToTake(1000);
		assertEquals(1000, humanPlayer.getSticksToTake());
	}
}
