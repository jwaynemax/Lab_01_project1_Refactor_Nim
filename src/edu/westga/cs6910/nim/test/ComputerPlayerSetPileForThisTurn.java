package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Pile;

class ComputerPlayerSetPileForThisTurn {

	@Test
	void tesSetPileForThisTurn4() {
		ComputerPlayer computer = new ComputerPlayer();	
		Pile pile = new Pile(4);
		computer.setPileForThisTurn(pile);
		assertEquals("Pile size: 4", computer.getPileForThisTurn().toString());
	}
	
	@Test
	void tesSetPileForThisTurn1() {
		ComputerPlayer computer = new ComputerPlayer();	
		Pile pile = new Pile(1);
		computer.setPileForThisTurn(pile);
		assertEquals("Pile size: 1", computer.getPileForThisTurn().toString());
	}
	
	@Test
	void tesSetPileForThisTurn1000() {
		ComputerPlayer computer = new ComputerPlayer();	
		Pile pile = new Pile(1000);
		computer.setPileForThisTurn(pile);
		assertEquals("Pile size: 1000", computer.getPileForThisTurn().toString());
	}

}
