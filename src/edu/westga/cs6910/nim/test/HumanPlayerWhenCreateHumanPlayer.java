package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.HumanPlayer;

class HumanPlayerWhenCreateHumanPlayer {

	@Test
	void testCreateHumanPlayerName() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");		
		assertEquals("Human", humanPlayer.getName());
	}
	
	@Test
	void testCreateHumanPlayerGetSticksToTake() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");		
		assertEquals(0, humanPlayer.getSticksToTake());
	}
	
	@Test
	void testCreateHumanPlayerGetPlayerWithNewName() {
		HumanPlayer humanPlayer = new HumanPlayer("Human");		
		humanPlayer.setName("New Human");
		assertEquals("New Human", humanPlayer.getName());
	}

}
