package model.paymentImpl;

import model.Payment;

public class Credit extends Payment {

	private double acresc;
	public Credit(double acresc) {
		this.acresc = acresc;
	}
	
	public double calc(double value) {
		return value + (value * acresc);
	}
}
