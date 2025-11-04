package model;

import java.util.List;

public class Invoice {

	private Venda venda;
	
	public Invoice(Venda venda) {
		this.venda = venda;
	}
	
	public String buildInvoice() {
		List<Item> itensVenda = venda.getItensVenda();
		StringBuilder sb = new StringBuilder();
		sb.append("Nome " + "Quantidade " +  "total   ").append(System.lineSeparator());
		for (Item item : itensVenda) {
			sb.append(item.getName() + "   " + item.getAmount() + "     " + item.calculatePrice()).append(System.lineSeparator());
		}
		
		sb.append("TOTAL DA NOTA: " + venda.getTotal());
		
		return sb.toString();
	}
	
}
