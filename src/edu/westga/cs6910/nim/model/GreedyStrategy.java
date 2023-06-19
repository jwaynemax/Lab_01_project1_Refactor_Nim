package edu.westga.cs6910.nim.model;

import edu.westga.cs6910.nim.model.strategy.NumberOfSticksStrategy;

/**
 * Implement the game-play strategy that always ensures the computer player will always select the largest number of sticks possible
 * @author Justin Maxwell
 * @version Summer 2023
 */
public class GreedyStrategy implements NumberOfSticksStrategy {

	/**
	 * Game play strategy that takes all but 1 stick
	 */
	@Override
	public int howManySticks(int pileSize) {
		if (pileSize <= 0) {
			throw new IllegalArgumentException("pileSize cannot be less than or equal to 0");
		}
		
		return pileSize - 1; 
	}

}
