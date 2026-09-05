
package cs5800.homework4;

public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// Constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// Accessors
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	// Mutators
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// Print function
	public void printDetails() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Social Security Number: " + socialSecurityNumber);
	}
}