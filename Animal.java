import java.lang.Math;

/**
 * The Animal class defines an Animal. It is abstract,
 * and is inherited by the Goldfinch and BrownBear classes.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 *
 */
public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	InvalidSimIDException e = new InvalidSimIDException("An InvalidSimIDException has occurred. SimID must be greater than 0.");
	
	/**
	 * The empty argument constructor instantiates the class and initializes
	 * the variables with default values.
	 */
	public Animal() {
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	}
	
	/**
	 * The preferred constructor supports passing parameters to
	 * set the instance values.
	 * 
	 * @param simID The Simulation ID
	 * @param l The location
	 */
	public Animal(int simID, Location l) {
		setSimID(simID);
		this.location = l;
		this.full = false;
		this.rested = true;
	}
	
	/**
	 * This method simulates the animal eating. If the randomly generated number
	 * is less than or equal to 0.5, it will not be full.
	 * 
	 * @return Whether the animal is full
	 */
	public boolean eat() {
		double num = Math.random();
		if (num <= 0.5) {
			this.full = false;
		}
		else {
			this.full = true;
		}
		return this.full;
	}
	
	/**
	 * This method simulates the animal sleeping. If the randomly generated number
	 * is less than or equal to 0.5, it will not be rested.
	 * @return Whether the animal is rested
	 */
	public boolean sleep() {
		double num = Math.random();
		if (num <= 0.5) {
			this.rested = false;
		}
		else {
			this.rested = true;
		}
		return this.full;
	}

	/**
	 * This method is a getter for the simID variable.
	 * 
	 * @return The SimID
	 */
	public int getSimID() {
		return simID;
	}

	/**
	 * This method is a setter for the simID variable.
	 * 
	 * @param simID The SimID
	 * @return nothing
	 */
	public void setSimID(int simID) {
		if (simID < 0) {
			throw e;
		}
		else {
			this.simID = simID;
		}
	}

	/**
	 * This method is a getter for the location variable.
	 * 
	 * @return The location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * This method is a setter for the location variable.
	 * 
	 * @param location The location
	 * @return nothing
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * This method is a getter for the full variable.
	 * 
	 * @return Whether the animal is full
	 */
	public boolean isFull() {
		return full;
	}

	/**
	 * This method is a setter for the full variable.
	 * 
	 * @param full Whether the animal is full
	 * @return nothing
	 */
	public void setFull(boolean full) {
		this.full = full;
	}

	/**
	 * This method is a getter for the rested variable.
	 * 
	 * @return Whether the animal is rested
	 */
	public boolean isRested() {
		return rested;
	}

	/**
	 * This method is a setter for the rested variable.
	 * 
	 * @param rested Whether the animal is rested
	 * @return nothing
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
}
