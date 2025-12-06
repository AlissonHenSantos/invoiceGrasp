package model.paymentImpl;

import model.Payment;

public class Pix extends Payment{
	private double desc;
	
	public Pix(double desc) {
		this.desc = desc;
	}
	
	public double calc(double value) {
		return value - (value * desc);
	}
}
