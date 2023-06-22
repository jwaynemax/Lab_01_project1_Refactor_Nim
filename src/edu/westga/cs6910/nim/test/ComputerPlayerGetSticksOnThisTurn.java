package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

class ComputerPlayerGetSticksOnThisTurn {

	@Test
	void testNewComputerPlayerSticksToTakeOnThisTurn0() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		assertEquals(0, computer.getSticksOnThisTurn());
	}
	
	@Test
	void testComputerPlayerSetSticksToTakeOnThisTurn4() {
		CautiousStrategy strategy = new CautiousStrategy(); 
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		computer.setSticksToTake(4);
		assertEquals(4, computer.getSticksOnThisTurn());
	}
	
	@Test
	void testComputerPlayerSetSticksToTakeOnThisTurn1000() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		computer.setNumberSticksToTake(1000);
		assertEquals(1000, computer.getSticksToTake());
	}

}
