package model.entities;

public class SaleItem {
	private Item item;
	private Integer quantity;
	
	public SaleItem(String code, int quantity) {
		this.item = new Item(code);
		this.quantity = quantity;
	}

	public SaleItem(Item item, Integer quantity) {
		this.item = item;
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
	
	public Double getTotal() {
		return item.getPrice() * quantity; 
	}
	
}
