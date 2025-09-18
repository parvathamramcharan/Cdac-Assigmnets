package multiple_inheritence;

public class Driver {

	public static void main(String[] args) {
	   Bank b = new Bank();
	   b.withdraw();    //withdraw success...
	   b.confirmTrans(); //transaction confirm....
	   b.deposit();     //deposit success.......
	   b.transfer();    //transfer success....

	}

}
