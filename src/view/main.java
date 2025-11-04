package view;

import model.Invoice;
import model.Item;
import model.Venda;
import view.console.ConsoleInvoitePrinter;

public class main {
	
	public static void main(String[] args) {
		Item item = new Item("teste", 10.50, 4);
		Item item2 = new Item("teste", 10.0, 1);
		Venda venda = new Venda();
		venda.addItem(item);
		venda.addItem(item2);
		Invoice invoice = new Invoice(venda);
		
		InvoiceBuilder ib = new ConsoleInvoitePrinter(invoice);
		
		ib.print();
		
		
		
	}
	
	
}
