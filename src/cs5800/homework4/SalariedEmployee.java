
package cs5800.homework4;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Accessor
    public double getWeeklySalary() {
        return this.weeklySalary;
    }

    // Mutator
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    // Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Weekly salary: $%,.2f%n", weeklySalary);
    }
}
