package aggregation;

public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;

	// Constructor
	public Instructor(String firstName, String lastName, String officeNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setOfficeNumber(officeNumber);
	}

	// Accessors
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	// Mutators
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			System.err.println("First name cannot be blank");
			return;
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			System.err.println("Last name cannot be blank");
			return;
		}
		this.lastName = lastName;
	}

	public void setOfficeNumber(String officeNumber) {
		if (officeNumber == null || officeNumber.isEmpty()) {
			System.err.println("Office number cannot be blank");
			return;
		}
		this.officeNumber = officeNumber;
	}
}
