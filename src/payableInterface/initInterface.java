package payableInterface;

public class initInterface {

	public static void main(String[] args) {
		Payable[] payables = {
			new Freelancer("Stephanie", "Smith", 25, 32),
			new Freelancer("Mary", "Quinn", 19, 47),
			new VendorInvoice("Apple Store", "APPLE-1001", 875.50),
			new VendorInvoice("Google Store", "GOOGLE-1002", 1499.99)
		};

		double totalPayment = 0;

		for (Payable payable : payables) {
			payable.print();
			totalPayment += payable.calculatePayment();
		}

		System.out.printf("Total payout: $%,.2f%n", totalPayment);
	}

}
