package multiple_inheritence;

public class Bank implements TTP,ATM{

	@Override
	public void withdraw() {
		System.out.println("withdraw success...");
		
	}

	@Override
	public void transfer() {
		System.out.println("transfer success....");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit success.......");
		
	}

	@Override
	public void confirmTrans() {
		System.out.println("transaction confirm....");
		
	}

}
