package model;

public abstract class Payment {
	
	private String name;
	
	public Payment(String name) {
		this.name = name;
	}

	public abstract double pay(Double value);
	
	public String getTypePayment() {
		return this.name;
	}
}	
