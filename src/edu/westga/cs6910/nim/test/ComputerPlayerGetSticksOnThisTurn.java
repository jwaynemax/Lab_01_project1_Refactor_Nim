package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerGetSticksOnThisTurn {

	@Test
	void testNewComputerPlayerSticksToTakeOnThisTurn0() {
		ComputerPlayer computer = new ComputerPlayer();	
		assertEquals(0, computer.getSticksOnThisTurn());
	}
	
	@Test
	void testComputerPlayerSetSticksToTakeOnThisTurn4() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setSticksToTake(4);
		assertEquals(4, computer.getSticksOnThisTurn());
	}
	
	@Test
	void testComputerPlayerSetSticksToTakeOnThisTurn1000() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setNumberSticksToTake(1000);
		assertEquals(1000, computer.getSticksToTake());
	}

}
