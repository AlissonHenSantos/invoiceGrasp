package model.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Payment;
import model.entities.StockItem;
import model.paymentImpl.Credit;
import model.paymentImpl.Debit;
import model.paymentImpl.Pix;

public class DataMock {
	
	static Map<String, String[]> dbItem = new HashMap<>();
	static Map<String, Payment> dbPayment =  new HashMap<>();
	static List<StockItem> stockItens = new ArrayList<>();
	
	static {
		String[] item = {"arroz", "25.0"};
		String[] item2 = {"Feijao", "20.0"};
		String[] item3 = {"Macarrao", "15.0"};
		
		dbItem.put("arroz", item);
		dbItem.put("feijao", item2);
		dbItem.put("macarrao", item3);
		
		Pix pix = new Pix();
		Credit credit = new Credit();
		Debit debit = new Debit();
		
		dbPayment.put("debit", debit);
		dbPayment.put("credit", credit);
		dbPayment.put("pix", pix);
		
		StockItem s1 = new StockItem("arroz", 20);
		StockItem s2 = new StockItem("feijao", 20);
		StockItem s3 = new StockItem("macarrao", 20);
		
		stockItens.add(s1);
		stockItens.add(s2);
		stockItens.add(s3);
		
		
	}
	
	public static String[] getDbItem(String code) {
		return dbItem.get(code);
	}
	
	public static Payment getPayment(String code) {
		return dbPayment.get(code);
	}
	
	public static List<StockItem> getStockItens() {
		return stockItens;
	}

}
