package edu.westga.cs6910.nim.model;

import edu.westga.cs6910.nim.model.strategy.NumberOfSticksStrategy;

/**
 * Implement the game-play strategy that always returns 1 as the number of sticks to be taken from the Pile
 * @author CS6910
 * @version Summer 2023
 */
public class CautiousStrategy implements NumberOfSticksStrategy {

	/**
	 * Game play strategy that always returns 1 as number of sticks to take
	 */
	@Override
	public int howManySticks(int pileSize) {
		if (pileSize <= 0) {
			throw new IllegalArgumentException("pileSize cannot be less than or equal to 0");
		}
		return 1; 
	}

}
