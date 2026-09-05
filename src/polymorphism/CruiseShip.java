package polymorphism;

public class CruiseShip extends Ship {
	private int maxPassengers;

	// Constructor
	public CruiseShip(String name, String yearBuilt, int maxPassengers) {
		super(name, yearBuilt);
		setMaxPassengers(maxPassengers);
	}

	// Accessor
	public int getMaxPassengers() {
		return maxPassengers;
	}

	// Mutator
	public void setMaxPassengers(int maxPassengers) {
		if (maxPassengers < 0) {
			System.err.println("Maximum passengers cannot be negative");
			return;
		}
		this.maxPassengers = maxPassengers;
	}


    // Other methods
	// Override
	public void print() {
		System.out.println("Cruise ship name: " + getName());
		System.out.println("Maximum passengers: " + getMaxPassengers());
	}

}
