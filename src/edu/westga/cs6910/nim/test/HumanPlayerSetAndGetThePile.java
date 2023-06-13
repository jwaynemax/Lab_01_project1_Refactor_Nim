package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class HumanPlayerSetAndGetThePile {

	@Test
	void testSetThePileParam1() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");	
		Pile pile = new Pile(1);
		humanPlayer.setThePile(pile);
		assertEquals("Pile size: 1", humanPlayer.getThePile().toString());
	}
	
	@Test
	void testSetThePileParam1000() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");	
		Pile pile = new Pile(1000);
		humanPlayer.setThePile(pile);
		assertEquals("Pile size: 1000", humanPlayer.getThePile().toString());
	}
	
	@Test
	void testSetThePileParam7() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");	
		Pile pile = new Pile(7);
		humanPlayer.setThePile(pile);
		assertEquals("Pile size: 7", humanPlayer.getThePile().toString());
	}

}
