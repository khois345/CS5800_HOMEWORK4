package inheritance;



public class BaseEmployee extends Employee {
    private double baseSalary;

    // Constructor
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    // Accessor
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // Mutator
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Base salary: $%,.2f%n", baseSalary);
    }
}
