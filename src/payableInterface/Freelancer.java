package payableInterface;

public class Freelancer implements Payable {
	private String firstName;
	private String lastName;
	private double hourlyRate;
	private double workHours;

    // Constructor
	public Freelancer(String firstName, String lastName, double hourlyRate, double workHours) {
		setFirstName(firstName);
		setLastName(lastName);
		setHourlyRate(hourlyRate);
		setWorkHours(workHours);
	}


    // Accessors
	public String getFirstName() {
		return firstName;
	}

    public String getLastName() {
		return lastName;
	}

    public double getHourlyRate() {
		return hourlyRate;
	}

    public double getWorkHours() {
		return workHours;
	}

    //Override
	public String getPayeeName() {
		return firstName + " " + lastName;
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

	public void setHourlyRate(double hourlyRate) {
		if (hourlyRate < 0) {
			System.err.println("Hourly rate cannot be negative");
			return;
		}

		this.hourlyRate = hourlyRate;
	}

	public void setWorkHours(double workHours) {
		if (workHours < 0) {
			System.err.println("Work hours cannot be negative");
			return;
		}

		this.workHours = workHours;
	}


    // Other functions
	//Override
	public double calculatePayment() {
		double regularHours = Math.min(workHours, 40);
		double overtimeHours = Math.max(workHours - 40, 0);

		return regularHours * hourlyRate + overtimeHours * hourlyRate * 1.5;
	}

	//Override
	public void print() {
		System.out.printf("Freelancer: %s, payment: $%,.2f%n", getPayeeName(), calculatePayment());
	}
}
