package edu.westga.cs6910.nim.model.strategy;

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
		if (pileSize != 2) {
			randomNumber = (int) (Math.random() * (3 - 1 + 1)) + 1;
		}
		return randomNumber; 
	}
}
