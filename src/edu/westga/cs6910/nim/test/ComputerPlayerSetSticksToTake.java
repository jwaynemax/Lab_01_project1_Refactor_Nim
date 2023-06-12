package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerSetSticksToTake {

	@Test
	void testSetSticksToTake1() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setSticksToTake(1);
		assertEquals(1, computer.getSticksToTake());
	}
	
	@Test
	void testSetSticksToTake1000() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setSticksToTake(1000);
		assertEquals(1000, computer.getSticksToTake());
	}
	
	@Test
	void testSetSticksToTake7() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setSticksToTake(7);
		assertEquals(7, computer.getSticksToTake());
	}

}
