package model.data;

import java.util.HashMap;
import java.util.Map;

import model.Item;
import model.ItensVenda;
import model.Venda;

public class Mock {

	 static Map<Integer, Venda> dbVenda = new HashMap<Integer, Venda>();
	 
	 static {
		 Item item = new Item("Arroz", 10.50);
		 Item item2 = new Item("feijao", 10.0);
		 Item item3 = new Item("frango", 10.0);
		 
		 ItensVenda iv1 = new ItensVenda(item, 2);
		 ItensVenda iv2 = new ItensVenda(item2, 1);
		 ItensVenda iv3 = new ItensVenda(item3, 4);
		 
		 Venda v1 = new Venda();
		 v1.addItem(iv3);
		 v1.addItem(iv2);
		 
		 Venda v2 = new Venda();
		 v2.addItem(iv1);
		 
		 dbVenda.put(1, v1);
		 dbVenda.put(2, v2);
		 
	 }
	 
	 public static Venda getVenda(int id) {
		 return dbVenda.get(id);
	 }
	 
	 
}
