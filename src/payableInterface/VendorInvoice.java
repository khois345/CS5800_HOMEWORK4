package payableInterface;

public class VendorInvoice implements Payable {
	private String vendorName;
	private String invoiceNumber;
	private double dueAmount;

    // Constructor
	public VendorInvoice(String vendorName, String invoiceNumber, double dueAmount) {
		setVendorName(vendorName);
		setInvoiceNumber(invoiceNumber);
		setDueAmount(dueAmount);
	}


	// Accessors
	public String getVendorName() {
		return vendorName;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	// Override
	public String getPayeeName() {
		return vendorName;
	}


	// Mutators
	public void setVendorName(String vendorName) {
		if (vendorName == null || vendorName.isEmpty()) {
			System.out.println("Vendor name cannot be blank");
			return;
		}

		this.vendorName = vendorName;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		if (invoiceNumber == null || invoiceNumber.isEmpty()) {
			System.out.println("Invoice number cannot be blank");
			return;
		}

		this.invoiceNumber = invoiceNumber;
	}

	public void setDueAmount(double dueAmount) {
		if (dueAmount < 0) {
			System.out.println("Amount due cannot be negative");
			return;
		}

		this.dueAmount = dueAmount;
	}


	// Other functions
	// Override
	public double calculatePayment() {
		return dueAmount;
	}

	// Override
	public void print() {
		System.out.printf("Vendor Invoice: %s, invoice %s, payment: $%,.2f%n",
			getVendorName(), getInvoiceNumber(), calculatePayment()
        );
	}
}
