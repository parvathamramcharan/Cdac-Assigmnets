package assigment8;

//Problem 7: Interface with Multiple Implementations - Create an interface Payment with a
//method pay(). Implement this interface in two classes CreditCardPayment and
//PaypalPayment. Write a PaymentProcessor class that uses the Payment interface to
//process payments
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
