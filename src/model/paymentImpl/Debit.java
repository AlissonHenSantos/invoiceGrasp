package model.paymentImpl;

import model.Payment;

public class Debit extends Payment {

	public double calc(double value) {
		return value;
	}
}
