package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.Pile;

class PileWhenCreatePile {

	@Test
	public void testShouldProducePileWith1Stick() { 
		Pile oneStickPile = new Pile(1);  
		assertEquals("Pile size: 1",   oneStickPile.toString()); 
	}
	
	@Test
	public void testShouldThrowErrosSinceNegative() { 
		
		assertThrows(IllegalArgumentException.class, () -> {
			int negativeStick = -2;
			
			Pile negativeValue = new Pile(negativeStick);
			if (negativeValue.getSticksLeft() < 0) {
				throw new IllegalArgumentException("Cannot be negative");
			}
	    });
	}

}