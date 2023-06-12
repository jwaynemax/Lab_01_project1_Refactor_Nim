package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;

class ComputerPlayerSetAndGetThePile {

	@Test
	void testSetThePile4() {
		ComputerPlayer computer = new ComputerPlayer();	
		Pile pile = new Pile(4);
		computer.setThePile(pile);
		assertEquals("Pile size: 4", computer.getThePile().toString());
	}
	
	@Test
	void testSetThePile1() {
		ComputerPlayer computer = new ComputerPlayer();	
		Pile pile = new Pile(1);
		computer.setThePile(pile);
		assertEquals("Pile size: 1", computer.getThePile().toString());
	}
	

	@Test
	void testSetThePile1000() {
		ComputerPlayer computer = new ComputerPlayer();	
		Pile pile = new Pile(1000);
		computer.setThePile(pile);
		assertEquals("Pile size: 1000", computer.getThePile().toString());
	}
}
