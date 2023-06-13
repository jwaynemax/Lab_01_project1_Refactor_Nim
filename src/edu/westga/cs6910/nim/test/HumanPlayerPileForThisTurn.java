package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class HumanPlayerPileForThisTurn {

	@Test
	void testHumanPlayerPileForThisTurnParam7() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(7);
		human.setPileForThisTurn(pile);
		assertEquals("Pile size: 7", human.getPileForThisTurn().toString());
	}
	
	@Test
	void testHumanPlayerPileForThisTurnParam1000() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(1000);
		human.setPileForThisTurn(pile);
		assertEquals("Pile size: 1000", human.getPileForThisTurn().toString());
	}

	@Test
	void testHumanPlayerPileForThisTurnParam1() {
		HumanPlayer human = new HumanPlayer("Human");
		Pile pile = new Pile(1);
		human.setPileForThisTurn(pile);
		assertEquals("Pile size: 1", human.getPileForThisTurn().toString());
	}
}
