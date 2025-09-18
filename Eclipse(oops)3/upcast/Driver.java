package upcast;

public class Driver {

		public static void main(String[] args) {
			Customer c1 = new Customer(123,"ABC",100000);
            ClassicCustomer cc = new ClassicCustomer(222,"XYZ",200000,9.5);
            c1 = cc;
            c1.calInterest();//SI : 95000.0
            c1.dispCust();   //222 XYZ 200000.0  SBI    SI : 95000.0
            
//            Customer c1  = new ClassicCustomer(222,"XYZ",200000,9.5);
//            c1.calInterest();  //SI : 95000.0
//            c1.dispCust();      //222 XYZ 200000.0  SBI   interest rate : 9.5
		}     
		

	} 


