/**
 * The BrownBear class defines a BrownBear. It extends the Animal Class,
 * and implements the Walkable and Swimmable interfaces.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 *
 */
public class BrownBear extends Animal implements Walkable, Swimmable{
	private String subSpecies;
	
	InvalidSubspeciesException e = new InvalidSubspeciesException("Subspecies must be Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian.");
	
	private String[] validSubSpecies = new String[] {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
	/**
	 * The empty argument constructor instantiates the class and initializes
	 * the variables with default values.
	 */
	public BrownBear() {
		super();
		this.subSpecies = "Alaskan";
	}
	
	/**
	 * The preferred constructor supports passing parameters to
	 * set the instance values.
	 * 
	 * @param simID The Simulation ID
	 * @param l The location
	 * @param subSpecies The SubSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		super(simID, l);
		
		setSubSpecies(subSpecies);
		
	}
	
	/**
	 * This method is a getter for the subSpecies variable.
	 * 
	 * @return The SubSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}

	/**
	 * This method is a setter for the subSpecies variable.
	 * 
	 * @param subSpecies The SubSpecies
	 * @return nothing
	 */
	public void setSubSpecies(String subSpecies) {
		boolean valid = false;
		for (String ss : validSubSpecies) {
			if (ss.equals(subSpecies)) {
				valid = true;
			}
		}
		
		if (!valid) {
			throw e;
		}
		else {
			this.subSpecies = subSpecies;
		}
	}
	
	/**
	 * This method updates the location by a value of 3.
	 * 
	 * @param direction The direction that is being walked. 0= North; 1= East; 2= South; 3= West;
	 */
	public void walk(int direction) {
		if (direction == 0) {
			this.location.update(this.location.getCoordinates()[0],this.location.getCoordinates()[1] + 3);
		}
		else if (direction == 1) {
			this.location.update(this.location.getCoordinates()[0] + 3, this.location.getCoordinates()[1]);
		}
		else if (direction == 2) {
			this.location.update(this.location.getCoordinates()[0], this.location.getCoordinates()[1] - 3);
		}
		else {
			this.location.update(this.location.getCoordinates()[0] - 3, this.location.getCoordinates()[1]);
		}
	}
	
	/**
	 * This method updates the location by a value of 2.
	 * 
	 * @param direction The direction that is being walked. 0= North; 1= East; 2= South; 3= West;
	 */
	public void swim(int direction) {
		if (direction == 0) {
			this.location.update(this.location.getCoordinates()[0],this.location.getCoordinates()[1] + 2);
		}
		else if (direction == 1) {
			this.location.update(this.location.getCoordinates()[0] + 2, this.location.getCoordinates()[1]);
		}
		else if (direction == 2) {
			this.location.update(this.location.getCoordinates()[0], this.location.getCoordinates()[1] - 2);
		}
		else {
			this.location.update(this.location.getCoordinates()[0] - 2, this.location.getCoordinates()[1]);
		}
	}
}
