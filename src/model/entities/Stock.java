package model.entities;

import java.util.List;

import model.data.DataMock;

public class Stock {
	
	private List<StockItem> stockItens;
	
	public Stock() {
		this.stockItens = DataMock.getStockItens();
	}
	

	public void debitStock(String code, int quantity) {
		StockItem stockItem = null;
		
		for(StockItem si : stockItens) {
			if(si.getItem().getName().equals(code)) {
				stockItem = si;
			}
		}
		
		stockItem.debitStock(quantity);
	}
	
	
}
