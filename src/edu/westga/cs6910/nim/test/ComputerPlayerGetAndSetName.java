package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerGetAndSetName {

	@Test
	void testNewComputerPlayerName() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		assertEquals("Simple computer", computer.getName());
	}
	
	@Test
	void testSetComputerPlayerNameNewComputer() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		computer.setName("New Computer");
		assertEquals("New Computer", computer.getName());
	}

	@Test
	void testSetComputerPlayerNameNone() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		computer.setName("");
		assertEquals("", computer.getName());
	}
}
