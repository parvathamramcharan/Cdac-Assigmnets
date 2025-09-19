package problem4;
//Demonstrate calling the constructor of the base class from the constructor of the derived
//class. Create objects of person and employee classes to show the order of invocation of
//constructors.
public class Driver {

	public static void main(String[] args) {
	    Person p = new Person("ram",21);
	    p.display();
	    
	    Employee e = new Employee("raju",21,12345,200000);
	    e.display();

	}

}
