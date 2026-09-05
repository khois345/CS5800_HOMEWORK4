package inheritance;



public class HourlyEmployee extends Employee {
    private double wage;
    private double workHours;

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double workHours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.workHours = workHours;
    }

    // Accessors
    public double getWage() {
        return this.wage;
    }

    public double getWorkHours() {
        return this.workHours;
    }

    // Mutators
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    // Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Wage: $%.2f, Hours worked: %.1f%n", wage, workHours);
    }
}
