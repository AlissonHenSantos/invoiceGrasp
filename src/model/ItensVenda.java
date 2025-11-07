package model;

public class ItensVenda {
	private Item item;
	private Integer quantity;
	private Double total;
	
	
	
	public ItensVenda(Item item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
		this.total = item.getPrice() * quantity;
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}
