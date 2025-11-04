package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Item> itensVenda;
	private Double total;
	public Venda() {
		this.itensVenda = new ArrayList<Item>();
		total = 0.0;
	}
	
	public void addItem(Item item) {
		total += item.calculatePrice();
		itensVenda.add(item);
	}
	
	public List<Item> getItensVenda(){
		return this.itensVenda;
	}
	
	public Double getTotal() {
		return total;
	}
	
	
	
}
