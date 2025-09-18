package interface1;

public class Bank implements ATM {

	@Override
	public void withdraw() {
		System.out.println("withdraw sucess");
	}

	@Override
	public void deposit() {
		System.out.println("deposit success and won cashback "+cashback);
		
	}

	@Override
	public void transform() {
		System.out.println("transform sucess");
		
	}
       
	        
}
