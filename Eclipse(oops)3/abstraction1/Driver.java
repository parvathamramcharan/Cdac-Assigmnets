package abstraction1;

public class Driver {

	public static void main(String[] args) {
		Person  p = new Student();  //up cast
		p.eat(); // eat
		p.talk(); //speaks telugu  after override speaks french
		
		//p.study(); //compile error 
		new Student().study();  //study java
		

	}

}
  
