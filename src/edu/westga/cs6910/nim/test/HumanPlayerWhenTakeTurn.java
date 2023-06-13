package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class HumanPlayerWhenTakeTurn {

	@Test
	void testHumanPlayerGetPileSizeAfterTakeTurn() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(7);
		human.setThePile(pile);
		human.setSticksToTake(3);
		human.takeTurn();
		assertEquals("Pile size: 4", human.getThePile().toString());
	}
	
	@Test
	void testHumanPlayerGetPileForThisTurn() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(7);
		human.setThePile(pile);
		human.setSticksToTake(3);
		human.takeTurn();
		assertEquals("Pile size: 4", human.getPileForThisTurn().toString());
	}
	
	@Test
	void testHumanPlayerGetSticksLeft() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(7);
		human.setThePile(pile);
		human.setSticksToTake(3);
		human.takeTurn();
		assertEquals(4, pile.getSticksLeft());
	}

}
