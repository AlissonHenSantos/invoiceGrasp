package view;

import model.Payment;
import model.Venda;

public abstract class InvoiceBuilder {
	
	protected Venda venda;
	protected Payment payment;
	public InvoiceBuilder(Venda venda) {
		this.venda = venda;
	}
	
	abstract public void print();
}
