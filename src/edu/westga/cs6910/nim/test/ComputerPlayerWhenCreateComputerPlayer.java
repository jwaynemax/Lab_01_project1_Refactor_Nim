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

}
