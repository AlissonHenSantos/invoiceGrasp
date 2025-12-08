package model;

import model.entities.Sale;
import model.entities.Stock;

public class SaleManager {

	private Sale sale;
	private Stock stock;
	
	public SaleManager() {
		stock = new Stock();
	}
	
	public void open() {
		if (isOpen()) throw new IllegalStateException("Venda já está aberta.");
		
		this.sale = new Sale();
	}
	
	public void close() {
		this.sale = null;
	}
	
	public void addItem(String prodCode, int amount) {
		if (isOpen()) { 
			stock.debitStock(prodCode, amount);
			sale.addItem(prodCode, amount);
		}
		else throw new IllegalStateException("Venda não aberta");
	}
	
	public void cretePayment(String method) {
		if (isOpen()) sale.setPaymentMethod(method);
		else throw new IllegalStateException("Venda não aberta");
	}
	
	public Sale getSale() {
		return sale;
	}
	
	private boolean isOpen() {
		return sale != null;
	}
}
