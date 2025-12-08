package view;

import model.InvoicePrinter;
import model.SaleManager;

import view.console.ConsoleInvoicePrinter;

public class Main {
	static SaleManager saleManager = new SaleManager();
	
	public static void main(String[] args) {
		
		saleManager.open();
		saleManager.addItem("arroz", 12);
		saleManager.cretePayment("pix");
		
		InvoicePrinter ip = new ConsoleInvoicePrinter();
		ip.printSale(saleManager);
		
	}
}
