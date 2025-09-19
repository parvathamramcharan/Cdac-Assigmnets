package assigment8;

public class PaypalPayment implements Payment{

	@Override
	public void pay(int money) {
		System.out.println("Payment of "+money+" is done via Paypal Payment");
		
	}
 
}
