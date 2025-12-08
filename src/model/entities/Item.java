package model.entities;

import model.data.DataMock;

public class Item {
	private String name;
	private Double price;
	
	public Item(String code) {
		String[] itemData = DataMock.getDbItem(code);
		if(itemData == null) {
			throw new IllegalArgumentException("Codigo de produto inexistente");
		}
		
		this.name = itemData[0];
		this.price = Double.parseDouble(itemData[1]);
		
	}

	public Item(String name, Double price) {
		this.name = name;
		this.price = price;
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
	

}
