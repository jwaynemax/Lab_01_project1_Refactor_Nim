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
	public void testShouldProducePileWith7Sticks() { 
		Pile sevenStickPile = new Pile(7);  
		assertEquals("Pile size: 7",   sevenStickPile.toString()); 
	}
	
	@Test
	public void testShouldProducePileWith2Sticks() { 
		Pile twoStickPile = new Pile(2);  
		assertEquals("Pile size: 2",   twoStickPile.toString()); 
	}

}