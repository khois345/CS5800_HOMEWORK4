package polymorphism;

public class Ship {
	private String name;
	private String yearBuilt;

	// Constructor
	public Ship(String name, String yearBuilt) {
		setName(name);
		setYearBuilt(yearBuilt);
	}

	// Accessors
	public String getName() {
		return name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	// Mutators
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.err.println("Ship name cannot be blank");
			return;
		}
		this.name = name;
	}

	public void setYearBuilt(String yearBuilt) {
		if (yearBuilt == null || yearBuilt.isEmpty()) {
			System.err.println("Year built cannot be blank");
			return;
		}
		this.yearBuilt = yearBuilt;
	}

	// Other functions
	public void print() {
        System.out.println("Printing ship details:");
		System.out.println("Ship name: " + name);
		System.out.println("Year built: " + yearBuilt);
	}

}
