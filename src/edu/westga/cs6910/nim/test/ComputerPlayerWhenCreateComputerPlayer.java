package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerWhenCreateComputerPlayer {

	@Test
	void testCreateComputerPlayerName() {
		ComputerPlayer getComputerName = new ComputerPlayer();		
		assertEquals("Simple computer", getComputerName.getName());
	}
	
	@Test
	void testCreateComputerPlayerGetSticksToTake() {
		ComputerPlayer getComputer = new ComputerPlayer();		
		assertEquals(0, getComputer.getSticksToTake());
	}
	
	@Test
	void testCreateComputerPlayerGetPlayerWithNewName() {
		ComputerPlayer getComputerName = new ComputerPlayer();	
		getComputerName.setName("New Computer");
		assertEquals("New Computer", getComputerName.getName());
	}

}
