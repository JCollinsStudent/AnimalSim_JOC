/**
 * This Animal Simulation project includes code that could
 * be used to create an Animal Simulation.
 * This specific class is used to test the functionality of the Animal Simulation project.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-03-21
 *
 */
public class Application {
	/**
	 * This is the main method which tests all of the objects and methods within each class, as well as any exceptions.
	 * 
	 * @param args unused
	 * @return nothing
	 */
	public static void main(String[] args) {

		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i=0; i<17; i++) {
			System.out.print(" ");
		}
		System.out.println("Location Tests");
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		System.out.println("\nEmpty Constructor generated coords:");
		
		Location defaultLoc = new Location();
		
		for (int coord : defaultLoc.getCoordinates()) {
			System.out.println(coord);
		}
		System.out.println("\nConstructor set coords:");
		
		Location customLoc = new Location(3,5);
		
		for (int coord: customLoc.getCoordinates()) {
			System.out.println(coord);
		}
		
		System.out.println("Location update() test:");
		customLoc.update(6, 10);
		
		for (int coord: customLoc.getCoordinates()) {
			System.out.println(coord);
		}
		System.out.println();
		
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i=0; i<17; i++) {
			System.out.print(" ");
		}
		System.out.println("Animal Tests");
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		
		//Animal myAnimal = new Animal(); does not work.
		Animal myAnimal = new BrownBear();
		System.out.println("\nEmpty Constructor generated vars:");
		System.out.println(myAnimal.getSimID());
		System.out.println(myAnimal.getLocation().getCoordinates()[0]);
		System.out.println(myAnimal.getLocation().getCoordinates()[1]);
		System.out.println(myAnimal.isFull());
		System.out.println(myAnimal.isRested());
		
		System.out.println("\nConstructor set vars:");
		Animal customAnimal = new BrownBear(1, new Location(3,5), "Alaskan");
		System.out.println(customAnimal.getSimID());
		System.out.println(customAnimal.getLocation().getCoordinates()[0]);
		System.out.println(customAnimal.getLocation().getCoordinates()[1]);
		System.out.println(customAnimal.isFull());
		System.out.println(customAnimal.isRested());
		
		System.out.println("\nSetter Tests:");
		customAnimal.setSimID(13);
		customAnimal.setLocation(new Location(25,50));
		customAnimal.setFull(true);
		customAnimal.setRested(false);
		System.out.println(customAnimal.getSimID());
		System.out.println(customAnimal.getLocation().getCoordinates()[0]);
		System.out.println(customAnimal.getLocation().getCoordinates()[1]);
		System.out.println(customAnimal.isFull());
		System.out.println(customAnimal.isRested());
		
		System.out.println("Eat & Sleep Tests:");
		System.out.println(customAnimal.eat());
		System.out.println(customAnimal.sleep());
		System.out.println();
		
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i=0; i<17; i++) {
			System.out.print(" ");
		}
		System.out.println("Goldfinch Tests:");
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		
		Goldfinch gf = new Goldfinch();
		System.out.println("\nEmpty Constructor generated vars:");
		System.out.println(gf.getWingSpan());
		
		Goldfinch customGf = new Goldfinch(12, new Location(2,4), 6.5);
		System.out.println("\nConstructor set vars:");
		System.out.println(customGf.getWingSpan());
		
		System.out.println("\nSetter Test:");
		customGf.setWingSpan(8.0);
		System.out.println(customGf.getWingSpan());
		
		System.out.println("\nFly & Walk Tests:");
		customGf.fly(new Location(30,15));
		System.out.println(customGf.getLocation().getCoordinates()[0]);
		System.out.println(customGf.getLocation().getCoordinates()[1] + "\n");
		
		customGf.walk(1);
		System.out.println(customGf.getLocation().getCoordinates()[0]);
		System.out.println(customGf.getLocation().getCoordinates()[1] + "\n");
		
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i=0; i<17; i++) {
			System.out.print(" ");
		}
		System.out.println("BrownBear Tests:");
		for (int i=0; i<45; i++) {
			System.out.print("*");
		}
		
		BrownBear bb = new BrownBear();
		System.out.println("\nEmpty Constructor generated vars:");
		System.out.println(bb.getSubSpecies());
		
		BrownBear customBb = new BrownBear(12, new Location(100, 13), "Kodiak");
		System.out.println("\nConstructor set vars:");
		System.out.println(customBb.getSubSpecies());
		
		System.out.println("\nWalk & Swim Tests:");
		customBb.walk(1);
		System.out.println(customBb.getLocation().getCoordinates()[0]);
		System.out.println(customBb.getLocation().getCoordinates()[1] + "\n");
		customBb.swim(1);
		System.out.println(customBb.getLocation().getCoordinates()[0]);
		System.out.println(customBb.getLocation().getCoordinates()[1]+ "\n");

		//Exception Tests:
//		Location invalidX = new Location(-1,0); Provides message that X must be > 0.
//		Location invalidY = new Location(0, -1); Provides message that Y must be > 0.
		
//		Animal invalidSimID = new BrownBear(-1, new Location(0,0), "Alaskan"); Provides message that SimID must be > 0.
//		BrownBear invalidSubSpecies = new BrownBear(0, new Location(0,0), "Invalid"); Provides message that SubSpecies value is invalid.
		
//		Goldfinch invalidWingSpanSmall = new Goldfinch(0, new Location(0,0), 4.0); Provides message that WingSpan must be > 5.0cm.
//		Goldfinch invalidWingSpanLarge = new Goldfinch(0, new Location(0,0), 12.0); Provides message that WingSpan must be < 11.0cm.
	}

}
