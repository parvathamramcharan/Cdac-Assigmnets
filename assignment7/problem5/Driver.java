package problem5;
//. 5. Create a class with a method that prints "This is parent class" and its subclass with another
//method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

public class Driver {

	public static void main(String[] args) {
		// 1. Method of parent class by object of parent class
        Parent p = new Parent();
        p.displayParent();
        
        // 2. Method of child class by object of child class
        Child c = new Child();
        c.dispChild();
        
        // 3. Method of parent class by object of child class
        c.displayParent();

	}

}
