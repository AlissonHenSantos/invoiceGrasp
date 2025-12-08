package model.paymentImpl;

import model.Payment;

public class Pix extends Payment {

	public Pix() {
		super("pix");
	}
	
	public double pay(Double value) {
		return value - (value * 0.05);
	}
}
