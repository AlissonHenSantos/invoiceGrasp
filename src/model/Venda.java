package model;

import java.util.ArrayList;
import java.util.List;

import model.data.Mock;
import model.data.PaymentMethods;

public class Venda {

	private List<ItensVenda> itensVenda;
	private Double total;
	private Payment payment;
	
	public Venda() {
		this.itensVenda = new ArrayList<ItensVenda>();
		total = 0.0;
	}
	
	public void addItem(ItensVenda item) {
		Estoque estoque = Mock.getEstoque(item.getItem());
		if(estoque != null) {
			estoque.subQuantity(item.getQuantity());
			total += item.getTotal();
			itensVenda.add(item);
		}
		
	}
	
	public List<ItensVenda> getItensVenda(){
		return this.itensVenda;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void pay(String method) {
		payment = PaymentMethods.getMethod(method);
	}
	
	public double getTotalToBePaid() {
		return payment.calc(total);
	}
	
	
	
}
