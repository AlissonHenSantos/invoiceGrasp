package model.data;

import java.util.HashMap;
import java.util.Map;

import model.Payment;
import model.paymentImpl.Credit;
import model.paymentImpl.Debit;
import model.paymentImpl.Pix;

public class PaymentMethods {

	static Map<String, Payment> dbPayment = new HashMap<>();
	
	static {
		dbPayment.put("pix", new Pix(0.05));
		dbPayment.put("debit", new Debit());
		dbPayment.put("credit", new Credit(0.05));
	}
	
	public static Payment getMethod(String method) {
		return dbPayment.get(method);
	}
}
