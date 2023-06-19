package edu.westga.cs6910.nim.model;

import edu.westga.cs6910.nim.model.strategy.NumberOfSticksStrategy;

/**
 * ComputerPlayer represents a very simple automated player in the game Nim.
 * It removes 1 stick at a time.
 * This class was started by CS6910
 * @author Justin Maxwell
 * @version Summer 2023
 */
public class ComputerPlayer extends AbstractPlayer {
	private static final String NAME = "Simple computer";
	private NumberOfSticksStrategy strategy;
	
	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * @param strategy to set the strategy as either Cautious, Greeedy, or Random
	 */
	public ComputerPlayer(NumberOfSticksStrategy strategy) {
		super(null);
		setName(NAME);
		setSticksToTake(0);
		this.strategy = strategy;
	}
	
	@Override	
	/**
	 * Implements Player's setNumberSticksToTake() to set the number
	 * of sticks to 1.
	 * 
	 * @ensure  sticksOnThisTurn() == 1
	 * 
	 * @see Player#setNumberSticksToTake()
	 */
	public void setNumberSticksToTake() {
		this.setSticksToTake(this.strategy.howManySticks(this.getSticksLeft()));
	}
	
	/**
	 * Set the strategy as passed in by the game
	 * @param strategy to set the strategy as eithere Cautious, Greeedy, or Random
	 */
	public void setStrategy(NumberOfSticksStrategy strategy) {
		this.strategy = strategy;
	}
}
