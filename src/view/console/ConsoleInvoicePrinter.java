package view.console;

import java.util.List;

import model.ItensVenda;
import model.Payment;
import model.Venda;
import view.InvoiceBuilder;

public class ConsoleInvoicePrinter extends InvoiceBuilder {

	public ConsoleInvoicePrinter(Venda venda) {
		super(venda);
	}
	private String buildInvoice() {
		List<ItensVenda> itensVenda = venda.getItensVenda();
		StringBuilder sb = new StringBuilder();
		sb.append("Nome " + "Quantidade " +  "total   ").append(System.lineSeparator());
		for (ItensVenda item : itensVenda) {
			sb.append(item.getItem().getName() + "   " + item.getQuantity() + "     " + item.getTotal()).append(System.lineSeparator());
		}
		
		sb.append("TOTAL DA NOTA: " + venda.getTotal()).append(System.lineSeparator());
		
		sb.append("TOTAL A PAGAR: " + venda.getTotalToBePaid());
		
		return sb.toString();
	}
	
	@Override
	public void print() {
		System.out.println(buildInvoice());
	}
}
