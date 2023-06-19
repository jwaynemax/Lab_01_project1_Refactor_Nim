package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;

class ComputerPlayerSetPileForThisTurn {

	@Test
	void testSetPileForThisTurn4() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(4);
		computer.setPileForThisTurn(pile);
		assertEquals("Pile size: 4", computer.getPileForThisTurn().toString());
	}
	
	@Test
	void testSetPileForThisTurn1() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(1);
		computer.setPileForThisTurn(pile);
		assertEquals("Pile size: 1", computer.getPileForThisTurn().toString());
	}
	
	@Test
	void testSetPileForThisTurn1000() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		Pile pile = new Pile(1000);
		computer.setPileForThisTurn(pile);
		assertEquals("Pile size: 1000", computer.getPileForThisTurn().toString());
	}
}
