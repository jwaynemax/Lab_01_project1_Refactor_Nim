package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerNumberSticksToTake {

	@Test
	void testSetNumberSticksToTakeNoParam() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setNumberSticksToTake();
		assertEquals(1, computer.getSticksToTake());
	}
	
	@Test
	void testSetNumberSticksToTakeWithParam() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setNumberSticksToTake(3);
		assertEquals(3, computer.getSticksToTake());
	}
	
	@Test
	void testSetNumberSticksToTakeLargeNumber() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setNumberSticksToTake(1000);
		assertEquals(1000, computer.getSticksToTake());
	}

}
