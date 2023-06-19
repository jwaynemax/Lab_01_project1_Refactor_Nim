package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;

class ComputerPlayerSetAndGetThePile {

	@Test
	void testSetThePile4() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Pile pile = new Pile(4);
		computer.setThePile(pile);
		assertEquals("Pile size: 4", computer.getThePile().toString());
	}
	
	@Test
	void testSetThePile1() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(1);
		computer.setThePile(pile);
		assertEquals("Pile size: 1", computer.getThePile().toString());
	}
	

	@Test
	void testSetThePile1000() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(1000);
		computer.setThePile(pile);
		assertEquals("Pile size: 1000", computer.getThePile().toString());
	}
}
