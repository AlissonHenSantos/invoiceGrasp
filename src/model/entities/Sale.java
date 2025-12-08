package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.Payment;
import model.data.DataMock;

public class Sale{

	private List<SaleItem> saleItens;
	private Payment payment;
	
	public Sale() {
		this.saleItens = new ArrayList<SaleItem>();
	}
	
	public List<SaleItem> getSaleItens() {
		return saleItens;
	}
	public Payment getPayment() {
		return payment;
	}
	
	public Double calculateTotalSale() {
		double total = 0;
		for(SaleItem s : saleItens) {
			total += s.getTotal();
		}
		return total;
	}
	
	public void addItem(String code, int quantity) {
		SaleItem saleItem = createSaleItem(code, quantity);
		
		saleItens.add(saleItem);
	}
	
	private SaleItem createSaleItem (String code, int quantity) {
		return new SaleItem(code, quantity);
	}
	
	public void setPaymentMethod(String code) {
		this.payment = DataMock.getPayment(code);
	}
	public Double getTotalToPay() {
		return this.payment.pay(calculateTotalSale());
	}
	
	
}
