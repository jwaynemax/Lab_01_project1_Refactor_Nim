package edu.westga.cs6910.nim.model.strategy;

/**
 * Define the common interface for all the game-play algorithms for the 1-Pile version of Nim
 * @author jm00724
 * @version Summer 2023
 */
public interface NumberOfSticksStrategy {
	
	
	/**
	 * Determine how many sticks method will take
	 * @precondition pileSize > 0
	 * @param pileSize determine the size of the pile
	 * @returns  number of sticks to take, an integer that is > 0 and <= the pile size
	 */
	void howManySticks(int pileSize);

}
