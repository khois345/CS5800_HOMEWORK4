package inheritance;



public class CommisionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    // Constructor
    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // Accessors
    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    // Mutator
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    // Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Commission rate: %.0f%%, Gross sales: $%,.2f%n",
                commissionRate * 100, grossSales);
    }
}
