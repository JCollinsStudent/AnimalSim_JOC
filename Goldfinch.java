/**
 * The Goldfinch class defines a Goldfinch. It extends the Animal Class,
 * and implements the Flyable and Walkable interfaces.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 *
 */
public class Goldfinch extends Animal implements Flyable, Walkable{
	private double wingSpan;
	
	InvalidWingspanException eLarge = new InvalidWingspanException("An InvalidWingspanException has occurred. Wingspan must be greater than 5.0cm");
	InvalidWingspanException eSmall = new InvalidWingspanException("An InvalidWingspanException has occurred. Wingspan must be smaller than 11.0cm");
	
	/**
	 * The empty argument constructor instantiates the class and initializes
	 * the variables with default values.
	 */
	public Goldfinch() {
		super();
		this.wingSpan = 9.0;
	}
	
	/**
	 * The preferred constructor supports passing parameters to
	 * set the instance values.
	 * 
	 * @param simID The Simulation ID
	 * @param l The location
	 * @param ws The WingSpan
	 */
	public Goldfinch(int simID, Location l, double ws) {
		super(simID, l);
		setWingSpan(ws);
	}

	/**
	 * This method is a getter for the wingSpan variable.
	 * 
	 * @return The WingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}

	/**
	 * This method is a setter for the wingSpan variable.
	 * 
	 * @param wingSpan The WingSpan
	 * @return nothing
	 */
	public void setWingSpan(double wingSpan) {
		if (wingSpan < 5.0) {
			throw eLarge;
		}
		else if (wingSpan > 11.0) {
			throw eSmall;
		}
		else {
			this.wingSpan = wingSpan;
		}
	}
	/**
	 * This method updates the location.
	 * 
	 * @param l The resulting location after flying.
	 */
	public void fly(Location l) {
		this.location.update(l.getCoordinates()[0], l.getCoordinates()[1]);
	}
	
	/**
	 * This method updates the location by a value of 1.
	 * 
	 * @param direction The direction that is being walked. 0= North; 1= East; 2= South; 3= West;
	 */
	public void walk(int direction) {
		if (direction == 0) {
			this.location.update(this.location.getCoordinates()[0],this.location.getCoordinates()[1] + 1);
		}
		else if (direction == 1) {
			this.location.update(this.location.getCoordinates()[0] + 1, this.location.getCoordinates()[1]);
		}
		else if (direction == 2) {
			this.location.update(this.location.getCoordinates()[0], this.location.getCoordinates()[1] - 1);
		}
		else {
			this.location.update(this.location.getCoordinates()[0] - 1, this.location.getCoordinates()[1]);
		}
	}
	
	
}
