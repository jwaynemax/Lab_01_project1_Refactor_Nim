package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class HumanPlayerGetSticksOnThisTurn {

	@Test
	void testHumanPlayerSticksToTakeOnThisTurn7() {
		HumanPlayer human = new HumanPlayer("Human");
		human.setSticksToTake(7);
		assertEquals(7, human.getSticksOnThisTurn());
	}
	
	@Test
	void testHumanPlayerSticksToTakeOnThisTurn1000() {
		HumanPlayer human = new HumanPlayer("Human");
		human.setSticksToTake(1000);
		assertEquals(1000, human.getSticksOnThisTurn());
	}
	
	@Test
	void testHumanPlayerSticksToTakeOnThisTurn1() {
		HumanPlayer human = new HumanPlayer("Human");
		human.setSticksToTake(1);
		assertEquals(1, human.getSticksOnThisTurn());
	}

}
