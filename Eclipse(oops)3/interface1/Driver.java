package interface1;

public class Driver {

	public static void main(String[] args) {
		ATM a = new Bank();
		a.withdraw();   //withdraw sucess
		a.transform();   //transform sucess
		a.deposit();    //deposit success and won cashback 10

	}

}
