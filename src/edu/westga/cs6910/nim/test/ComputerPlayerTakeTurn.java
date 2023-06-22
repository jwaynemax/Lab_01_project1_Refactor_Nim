package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;
import edu.westga.cs6910.nim.model.strategy.CautiousStrategy;

class ComputerPlayerTakeTurn {

	@Test
	void testTakeTurn4() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(4);
		computer.setThePile(pile);
		computer.setSticksToTake(1);
		computer.takeTurn();
		assertEquals("Pile size: 3", computer.getThePile().toString());
	}
	
	@Test
	void testTakeTurn1000() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(1000);
		computer.setThePile(pile);
		computer.setSticksToTake(999);
		computer.takeTurn();
		assertEquals("Pile size: 1", computer.getThePile().toString());
	}
	
	@Test
	void testTakeTurn2() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		Pile pile = new Pile(2);
		computer.setThePile(pile);
		computer.setSticksToTake(1);
		computer.takeTurn();
		assertEquals("Pile size: 1", computer.getThePile().toString());
	}

}
