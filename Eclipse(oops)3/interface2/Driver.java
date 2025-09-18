package interface2;

public class Driver {

	public static void main(String[] args) {
		printable p = new X();
		p.show();  // shows....
		p.prints(); //prints....
		
		X x = new X();
		x.show();    //shows....
		x.prints();  //prints....

	}

}
