package view;

import controller.VendaController;
import model.Venda;
import view.console.ConsoleInvoicePrinter;

public class Main {
	
	public static void main(String[] args) {
		
		VendaController vendaController = new VendaController();
		Venda v1 = vendaController.getVenda(1);
		v1.pay("pix");
		InvoiceBuilder ib = new ConsoleInvoicePrinter(v1);
		
		
		
		ib.print();
		
		
		
		
	}
	
	
}
