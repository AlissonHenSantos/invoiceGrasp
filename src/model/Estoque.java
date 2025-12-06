package model;

public class Estoque {

	private Item item;
	private Integer quantity;
	
	public Estoque() {
		
	}

	public Estoque(Item item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	public void subQuantity(int quantity) {
		if(this.quantity > quantity) {
			this.quantity -= this.quantity;
		}
	}
	
	
}
