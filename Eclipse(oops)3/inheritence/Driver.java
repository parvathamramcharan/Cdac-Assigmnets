package inheritence;

public class Driver {

	public static void main(String[] args) {
		Customer c1 = new Customer(123,"ABC",100000);
//		System.out.println(c1);   //Customer [cid=123, cname=ABC, balance=100000.0]

		c1.dispCust();       //123 ABC 100000.0  SBI
		c1.calInterest();   //total interest : 42500.0
		
		 
		
		ClassicCustomer cc  = new ClassicCustomer(222,"XYZ",100000,9.5);
		cc.dispCust();  //222 XYZ 100000.0  SBI    after => SI : 47500.0
		cc.calInterest();  //total interest : 42500.0
		
	}

} 
