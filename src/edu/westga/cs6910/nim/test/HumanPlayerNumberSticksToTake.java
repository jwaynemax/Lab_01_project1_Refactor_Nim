package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class HumanPlayerNumberSticksToTake {

	@Test
	void testHumanPlayerNumberSticksToTakeParam1() {
		HumanPlayer human = new HumanPlayer("Human");
		human.setNumberSticksToTake(1);
		assertEquals(1, human.getSticksToTake());
	}
	
	@Test
	void testHumanPlayerNumberSticksToTakeNoParam() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(7);
		human.setThePile(pile);
		human.setNumberSticksToTake();
		assertEquals(3, human.getSticksToTake());
	}
	
	@Test
	void testHumanPlayerNumberSticksToTakeParam1000() {
		HumanPlayer human = new HumanPlayer("Human");
		human.setNumberSticksToTake(1000);
		assertEquals(1000, human.getSticksToTake());
	}

}
