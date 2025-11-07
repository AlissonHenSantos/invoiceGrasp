package view.console;

import model.Invoice;
import view.InvoiceBuilder;

public class ConsoleInvoicePrinter extends InvoiceBuilder {

	public ConsoleInvoicePrinter(Invoice invoice) {
		super(invoice);
	}
	@Override
	public void print() {
		System.out.println(invoice.buildInvoice());
	}
}
