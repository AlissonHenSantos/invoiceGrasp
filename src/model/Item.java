package model;

public class Item {

	private String name;
	private Double price;
	private Integer amount;
	
	public Item() {
		
	}
	
	public Item(String name, Double price, Integer amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", total = " + calculatePrice() + "]";
	}
	
	public double calculatePrice() {
		return amount * price;
	}
	
	
	
}
