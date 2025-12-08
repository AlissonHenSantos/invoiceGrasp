package model.paymentImpl;

import model.Payment;

public class Debit extends Payment{

	public Debit() {
		super("debit");
	}
	
	public double pay(Double value) {
		return value;
	}
	
}
