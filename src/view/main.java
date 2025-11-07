package view;

import controller.VendaController;
import model.Invoice;
import model.Venda;
import view.console.ConsoleInvoicePrinter;

public class main {
	
	public static void main(String[] args) {
		
		VendaController vendaController = new VendaController();
		
		Venda v1 = vendaController.getVenda(1);
		
		Invoice invoice = new Invoice(v1);
		
		InvoiceBuilder ib = new ConsoleInvoicePrinter(invoice);
		
		ib.print();
		
		
		
		
	}
	
	
}
