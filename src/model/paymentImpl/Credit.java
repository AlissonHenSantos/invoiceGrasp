package model.paymentImpl;

import model.Payment;

public class Credit extends Payment {
	
	public Credit() {
		super("credit");
	}

	public double pay(Double value) {
		return value + (value * 0.05);
	}
}
