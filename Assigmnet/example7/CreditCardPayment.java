package assigment8;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(int money) {
		System.out.println("Payment of "+money+" is done via Credit Card  Payment");
		
	}

}
