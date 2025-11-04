package view.console;

import model.Invoice;
import view.InvoiceBuilder;

public class ConsoleInvoitePrinter extends InvoiceBuilder {

	public ConsoleInvoitePrinter(Invoice invoice) {
		super(invoice);
	}
	@Override
	public void print() {
		System.out.println(invoice.buildInvoice());
	}
}
