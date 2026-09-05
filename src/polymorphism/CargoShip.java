package polymorphism;

public class CargoShip extends Ship {
	private int cargoCapacity;

	// Constructor
	public CargoShip(String name, String yearBuilt, int cargoCapacity) {
		super(name, yearBuilt);
		setCargoCapacity(cargoCapacity);
	}

	// Accessor
	public int getCargoCapacity() {
		return cargoCapacity;
	}

	// Mutator
	public void setCargoCapacity(int cargoCapacity) {
		if (cargoCapacity < 0) {
			System.err.println("Cargo capacity cannot be negative");
			return;
		}
		this.cargoCapacity = cargoCapacity;
	}


	// Other methods
	// Override
	public void print() {
		System.out.println("Cargo ship name: " + getName());
		System.out.println("Cargo capacity: " + getCargoCapacity() + " tons");
	}

}
