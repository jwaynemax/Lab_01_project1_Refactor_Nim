package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.CautiousStrategy;
import edu.westga.cs6910.nim.model.ComputerPlayer;
import edu.westga.cs6910.nim.model.Game;
import edu.westga.cs6910.nim.model.HumanPlayer;
import edu.westga.cs6910.nim.model.Pile;

class ComputerPlayerNumberSticksToTake {

	@Test
	void testSetNumberSticksToTakeNoParam() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		
		Pile pile = new Pile(7);
		
		computer.setThePile(pile);
		
		computer.setNumberSticksToTake();
		assertEquals(1, computer.getSticksToTake());
	}
	
	@Test
	void testSetNumberSticksToTakeWithParam() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);	
		computer.setNumberSticksToTake(3);
		assertEquals(3, computer.getSticksToTake());
	}
	
	@Test
	void testSetNumberSticksToTakeLargeNumber() {
		CautiousStrategy strategy = new CautiousStrategy();
		ComputerPlayer computer = new ComputerPlayer(strategy);		
		computer.setNumberSticksToTake(1000);
		assertEquals(1000, computer.getSticksToTake());
	}

}
