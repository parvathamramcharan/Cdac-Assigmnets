package assigment10;

public class NegativeBalanceException extends Exception {
      public NegativeBalanceException(String message) {
    	  super(message);
      }
}




package assigment10;
//Problem 6: Create Customer class with the relevant information
//like name, address, id, phone no etc. Write a parameterized
//constructor and relevant methods (disp(), etc) appropriately.
//Create Account class with account type, account number,
//minimum balance etc., Write calculateInterest method (use simple
//interest – assume time and rate appropriately).
//Create a user defined exception class
//“NegativeBalanceException” and throw that exception when there
//is negative balance while calculating the interest.
//Use Account class in Customer class display the details of
//customers with account information. (No Inheritance – use
//association only)
public class Account {
     private String accType;
     private double accNumber;
     private static int minBalance=1000;
	 public Account(String accType, double accNumber) {
		this.accType = accType;
		this.accNumber = accNumber;
	 }
     public void calculateInterest(int amount) throws NegativeBalanceException {
    	 if(amount < minBalance) {
    		 throw new NegativeBalanceException("Must have minimum balance.....");
    	 }
    	 else {
    	 Double SI= (amount*1.5*1.8)/100;
    	 System.out.println("SI : "+SI);
    	 System.out.println("Amount : "+amount);
    	 }
     }
     @Override
     public String toString() {
         return "Account Type: " + accType + ", Account Number: " + accNumber;
     }
     public void display() {
    	 System.out.println("accType : "+accType);
    	 System.out.println("accNumber : "+accNumber);
     }
    
}




package assigment10;

public class Customer {
   private String name;
   private int id;
   private double phoneNumber;
   private String address;
   private Account account;
   public Customer(String name ,int id,double phoneNumber,String address,Account account) {
	   this.name= name;
	   this.address= address;
	   this.id = id;
	   this.phoneNumber=phoneNumber;
	   this.account=account;
   }
   public void display() {
	   System.out.println("name : "+name);
	   System.out.println("id : "+id);
	   System.out.println("phoneNumber : "+phoneNumber);
	   System.out.println("address : "+address);
	   System.out.println("Account details : "+account);
   }
   public static void main(String[] args) {
	Account acc = new Account("savings",56789);
	Customer cc = new Customer("ram",123,9948087,"hyd ammerpet",acc);
	cc.display();
	acc.display();
	
	
	try {
		acc.calculateInterest(2000);
	}
	catch(NegativeBalanceException e) {
		System.err.println(e.getMessage());
	}
	
	
	try {
		acc.calculateInterest(500);
	}
	catch(NegativeBalanceException e) {
		System.err.println(e.getMessage());
	}
	
	

    
	
}
}



