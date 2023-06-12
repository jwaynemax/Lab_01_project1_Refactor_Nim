package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;

class ComputerPlayerGetAndSetName {

	@Test
	void testNewComputerPlayerName() {
		ComputerPlayer computer = new ComputerPlayer();	
		assertEquals("Simple Computer", computer.getName());
	}
	
	@Test
	void testSetComputerPlayerNameNewComputer() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setName("New Computer");
		assertEquals("New Computer", computer.getName());
	}

	@Test
	void testSetComputerPlayerNameNone() {
		ComputerPlayer computer = new ComputerPlayer();	
		computer.setName("");
		assertEquals("", computer.getName());
	}
}
