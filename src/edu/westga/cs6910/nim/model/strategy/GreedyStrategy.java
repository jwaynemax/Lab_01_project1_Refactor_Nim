package edu.westga.cs6910.nim.model.strategy;

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
		
		if (pileSize > 3) {
			return 3;
		} else if (pileSize == 1) {
			return 1;
		} else {
			return pileSize  - 1;
		}		
	}
}
