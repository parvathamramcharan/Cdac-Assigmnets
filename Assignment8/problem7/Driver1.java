package assigment8;

public class Driver1 {

	public static void main(String[] args) {
	 PaypalPayment p = new PaypalPayment();
	 CreditCardPayment c = new CreditCardPayment();
	 
	 PaymentProcesssor processor1 = new PaymentProcesssor(p);
	 processor1.processPayment(150);
	 
	 
	 PaymentProcesssor processor2 = new PaymentProcesssor(c);
	 processor2.processPayment(950);
	 
	 
	 
		 
	}

}
