package edu.westga.cs6910.nim.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.nim.model.Pile;

class PileWhenRemoveSticks {

	@Test
	public void testByRemoving1Stick () {
		Pile tenStickPile = new Pile(10);
		tenStickPile.removeSticks(1);
		assertEquals(9, tenStickPile.getSticksLeft());
	}
	
	@Test
	public void testByRemovingAllSticks () {
		Pile tenStickPile = new Pile(10);
		tenStickPile.removeSticks(10);
		assertEquals(0, tenStickPile.getSticksLeft());
	}
	
	@Test
	public void testByRemovingAllBut1Sticks () {
		Pile tenStickPile = new Pile(10);
		tenStickPile.removeSticks(9);
		assertEquals(1, tenStickPile.getSticksLeft());
	}

}
