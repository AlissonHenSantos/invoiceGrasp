package model;

import java.util.List;

public class Invoice {

	private Venda venda;
	
	public Invoice(Venda venda) {
		this.venda = venda;
	}
	
	public String buildInvoice() {
		List<ItensVenda> itensVenda = venda.getItensVenda();
		StringBuilder sb = new StringBuilder();
		sb.append("Nome " + "Quantidade " +  "total   ").append(System.lineSeparator());
		for (ItensVenda item : itensVenda) {
			sb.append(item.getItem().getName() + "   " + item.getQuantity() + "     " + item.getTotal()).append(System.lineSeparator());
		}
		
		sb.append("TOTAL DA NOTA: " + venda.getTotal());
		
		return sb.toString();
	}
	
}
