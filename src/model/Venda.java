package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<ItensVenda> itensVenda;
	private Double total;
	public Venda() {
		this.itensVenda = new ArrayList<ItensVenda>();
		total = 0.0;
	}
	
	public void addItem(ItensVenda item) {
		total += item.getTotal();
		itensVenda.add(item);
	}
	
	public List<ItensVenda> getItensVenda(){
		return this.itensVenda;
	}
	
	public Double getTotal() {
		return total;
	}
	
	
	
}
