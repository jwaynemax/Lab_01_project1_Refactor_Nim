package edu.westga.cs6910.nim.model;

import edu.westga.cs6910.nim.model.strategy.NumberOfSticksStrategy;

/**
 * Implement the game-play strategy that returns a random number of sticks to take within the pile range and leaving one stick left
 * @author Justin Maxwell
 * @version Summer 2023
 */
public class RandomStrategy implements NumberOfSticksStrategy {

	/**
	 * Game play strategy that returns random number of sticks to take but leaves the last one
	 */
	@Override
	public int howManySticks(int pileSize) {
		int randomNumber = 1;
		if (pileSize <= 0) {
			throw new IllegalArgumentException("pileSize cannot be less than or equal to 0");
		}
		if (pileSize != 1) {
			randomNumber = (int) (Math.random() * pileSize) + 1;
		}
		return randomNumber; 
	}
}
