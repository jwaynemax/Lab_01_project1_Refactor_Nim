package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

class ComputerPlayerWhenCreateComputerPlayer {

	@Test
	void testCreateComputerPlayerName() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);			
		assertEquals("Simple computer", computer.getName());
	}
	
	@Test
	void testCreateComputerPlayerGetSticksToTake() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);			
		assertEquals(0, computer.getSticksToTake());
	}
	
	@Test
	void testCreateComputerPlayerGetPlayerWithNewName() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer getComputerName = new ComputerPlayer(strategy);	
		getComputerName.setName("New Computer");
		assertEquals("New Computer", getComputerName.getName());
	}

}
