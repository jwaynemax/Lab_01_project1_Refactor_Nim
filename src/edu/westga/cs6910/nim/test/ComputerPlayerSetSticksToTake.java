package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerSetSticksToTake {

	@Test
	void testSetSticksToTake1() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		computer.setSticksToTake(1);
		assertEquals(1, computer.getSticksToTake());
	}
	
	@Test
	void testSetSticksToTake1000() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		computer.setSticksToTake(1000);
		assertEquals(1000, computer.getSticksToTake());
	}
	
	@Test
	void testSetSticksToTake7() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		computer.setSticksToTake(7);
		assertEquals(7, computer.getSticksToTake());
	}

}
