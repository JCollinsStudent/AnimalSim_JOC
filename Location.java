/**
 * The Location class defines a location. It includes an X coordinate and a Y coordinate.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 *
 */
public class Location {
	private int xCoord;
	private int yCoord;
	
	InvalidCoordinateException eX = new InvalidCoordinateException("An InvalidCoordinateException has occurred. X coordinate must be greater than zero.");
	InvalidCoordinateException eY = new InvalidCoordinateException("An InvalidCoordinateException has occurred. Y coordinate must be greater than zero.");
	
	/**
	 * The empty argument constructor instantiates the class and initializes
	 * the variables with default values.
	 */
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}
	
	/**
	 * The preferred constructor supports passing parameters to
	 * set the instance values.
	 * 
	 * @param x The x coordinate
	 * @param y The y coordinate
	 */
	public Location(int x, int y) {
		if (x < 0) {
			throw eX;
		}
		else if (y < 0) {
			throw eY;
		}
		else {
			this.xCoord = x;
			this.yCoord = y;
		}
	}
	
	/**
	 * This method is a setter for the x and y coordinates.
	 * 
	 * @param x The x coordinate
	 * @param y The y coordinate
	 */
	public void update(int x, int y) {
		if (x < 0) {
			throw eX;
		}
		else if (y < 0) {
			throw eY;
		}
		else {
			this.xCoord = x;
			this.yCoord = y;
		}
	}
	
	/**
	 * This method is a getter for the coordinates.
	 * 
	 * @return An array containing the x and y coordinates.
	 */
	public int[] getCoordinates() {
		int[] coords =  new int[] {xCoord, yCoord};
		return coords;
	}
}
