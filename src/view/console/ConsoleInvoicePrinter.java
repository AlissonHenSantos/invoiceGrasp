package view.console;

import java.util.List;

import model.InvoicePrinter;
import model.SaleManager;
import model.entities.SaleItem;

public class ConsoleInvoicePrinter implements InvoicePrinter{

	@Override
	public void printSale(SaleManager saleManager) {
		System.out.println(buildInvoice(saleManager));
	}
	
	private String buildInvoice(SaleManager saleManager) {
		List<SaleItem> itensVenda = saleManager.getSale().getSaleItens();
		StringBuilder sb = new StringBuilder();
		sb.append("Nome " + "Quantidade " +  "total   ").append(System.lineSeparator());
		for (SaleItem item : itensVenda) {
			sb.append(item.getItem().getName() + "   " + item.getQuantity() + "     " + item.getTotal()).append(System.lineSeparator());
		}
		
		sb.append("TOTAL DA NOTA: " + saleManager.getSale().calculateTotalSale()).append(System.lineSeparator());
		sb.append("TOTAL A PAGAR: " + saleManager.getSale().getTotalToPay() + "   " + System.lineSeparator() +  "Metodo de magamento: " + saleManager.getSale().getPayment().getTypePayment());
		
		return sb.toString();
	}

}
