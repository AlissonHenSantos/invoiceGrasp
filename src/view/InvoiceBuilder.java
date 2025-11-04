package view;

import model.Invoice;

public abstract class InvoiceBuilder {
	
	protected Invoice invoice;
	
	public InvoiceBuilder(Invoice invoice) {
		this.invoice = invoice;
	}
	
	abstract public void print();
}
