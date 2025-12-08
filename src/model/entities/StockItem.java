package model.entities;

public class StockItem {

	private Item item;
	private Integer quantity;
	
	public StockItem() {
		
	}
	
	public StockItem(String code, int quantity) {
		this.item = new Item(code);
		this.quantity = quantity;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void debitStock(int quantity) {
		this.quantity =- quantity;
	}
}
