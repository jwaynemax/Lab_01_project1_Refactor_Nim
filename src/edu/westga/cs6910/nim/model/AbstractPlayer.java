package edu.westga.cs6910.nim.model;

/**
 * AbstractPlayer defines the methods for ComputerPlayer and HumanPlayer in the game Nim.
 * @author Justin Maxwell
 * @version Summer 2023
 */
public abstract class AbstractPlayer implements Player {
	private String name;
	private int sticksToTake;
	private Pile thePile;
	
	/**
	 * Constructor for AbstractPlayer
	 * @param name to set user name
	 */
	public AbstractPlayer(String name) {
		this.setName(name);
		this.setSticksToTake(0);
	}
	
	/**
	 * Set Pile for turn
	 * @see Player#setPileForThisTurn(Pile)
	 * @param aPile to define pile after sticks taken
	 */	
	public void setPileForThisTurn(Pile aPile) {		
		this.setThePile(aPile);

	}
	
	/**
	 * Take Turn
	 * @see Player#takeTurn()
	 */	
	public void takeTurn() {
		this.getThePile().removeSticks(this.getSticksToTake());
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
		this.setSticksToTake(number);
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
		return this.getSticksToTake();
	}

	@Override
	/**
	 * @see edu.westga.cs6910.nim.model.Player#getPileForThisTurn()
	 */

	public Pile getPileForThisTurn() {
		return this.getThePile();
	}

	/**
	 * Setter for name
	 * @param name defines player name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter for sticks to take
	 * @return sticks taken per turn
	 */
	public int getSticksToTake() {
		return this.sticksToTake;
	}

	/**
	 * setter for sticks to take
	 * @param sticksToTake to define sticks taken in turn
	 */
	public void setSticksToTake(int sticksToTake) {
		this.sticksToTake = sticksToTake;
	}

	/**
	 * Getter for pile
	 * @return current pile
	 */
	public Pile getThePile() {
		return this.thePile;
	}

	/**
	 * Setter for pile
	 * @param thePile sets the pile
	 */
	public void setThePile(Pile thePile) {
		this.thePile = thePile;
	}
	
	/**
	 * Get the current size of the pile to pass into howManySticks
	 * @return the current size of the pile
	 */
	public int getSticksLeft() {
		return this.thePile.getSticksLeft();
	}
}
