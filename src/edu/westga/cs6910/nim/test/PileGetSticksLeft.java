package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.Pile;

class PileGetSticksLeft {

	@Test
	public void testWith1StickPileShouldHave1StickLeft() {
		Pile oneStickPile = new Pile(1);
		assertEquals(1, oneStickPile.getSticksLeft());
	}
	
	@Test
	public void testWith7StickPileShouldHave7SticksLeft() {
		Pile sevenStickPile = new Pile(7);
		assertEquals(7, sevenStickPile.getSticksLeft());
	}
	
	@Test
	public void testWith2StickPileShouldHave2SticksLeft() {
		Pile twoStickPile = new Pile(2);
		assertEquals(2, twoStickPile.getSticksLeft());
	}

}
