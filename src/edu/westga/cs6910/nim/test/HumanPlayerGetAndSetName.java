package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;

class HumanPlayerGetAndSetName {

	@Test
	void testNewHumanPlayerName() {
		HumanPlayer human = new HumanPlayer("Human");	
		assertEquals("Human", human.getName());
	}
	
	@Test
	void testSetHumanPlayerNameNewHuman() {
		HumanPlayer human = new HumanPlayer("Human");
		human.setName("New Human");
		assertEquals("New Human", human.getName());
	}

	@Test
	void testSetHumanPlayerNameNone() {
		HumanPlayer human = new HumanPlayer("");
		human.setName("");
		assertEquals("", human.getName());
	}
}
