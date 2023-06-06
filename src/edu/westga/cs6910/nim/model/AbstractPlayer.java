package edu.westga.cs6910.nim.model;

/**
 * AbstractPlayer defines the methods for ComputerPlayer and HumanPlayer in the game Nim.
 * 
 * @author Justin Maxwell
 */
public abstract class AbstractPlayer implements Player {
	protected String name;
	protected int sticksToTake;
	protected Pile thePile;
	
	public AbstractPlayer(String name) {
		this.name = name;
		this.sticksToTake = 0;
	}
	
	/**
	 * Set Pile for turn
	 * @see Player#setPileForThisTurn(Pile)
	 * @param aPile
	 */	
	public void setPileForThisTurn(Pile aPile) {
		this.thePile = aPile;

	}
	
	/**
	 * Take Turn
	 * @see Player#takeTurn()
	 */	
	public void takeTurn() {

		this.thePile.removeSticks(this.sticksToTake);
	}
	
	@Override
	/**
	 * Implements Player's setNumberSticksToTake(int), but is not
	 * normally called by clients objects. Instead, clients usually
	 * call the 0-parameter version.
	 * 
	 * @see Player#setNumberSticksToTake(int)
	 */
	public void setNumberSticksToTake(int number) {
		this.sticksToTake = number;
	}
	
	@Override
	/**
	 * Implements Player's setNumberSticksToTake() to set the number
	 * of sticks to the maximum allowed for this turn.
	 * 
	 * @ensure  sticksOnThisTurn() == 
	 * 					Math.min(pileForThisTurn.sticksLeft()-1, 
	 * 							 Game.MAX_STICKS_PER_TURN)
	 * 
	 * @see Player#setNumberSticksToTake()
	 */
	public abstract void setNumberSticksToTake();
	

	@Override	
	/**
	 * @see Player#getName()
	 */
	public String getName() {
		return this.name;
	}
	
	@Override	
	/**
	 * @see Player#getSticksOnThisTurn()
	 */
	public int getSticksOnThisTurn() {
		return this.sticksToTake;
	}

	@Override
	/**
	 * @see edu.westga.cs6910.nim.model.Player#getPileForThisTurn()
	 */

	public Pile getPileForThisTurn() {
		return this.thePile;
	}
}
