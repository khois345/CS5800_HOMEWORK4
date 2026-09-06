package composition;

public class File {
	private String name;

	// Constructor
	public File(String name) {
		setName(name);
	}

	// Accessor
	public String getName() {
		return name;
	}

	// Mutator
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.err.println("File name cannot be blank");
			return;
		}

		this.name = name;
	}

	// Other functions
	public void print() {
		System.out.println("File: " + name);
	}
}
