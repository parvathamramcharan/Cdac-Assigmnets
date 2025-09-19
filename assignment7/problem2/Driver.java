package Problem2;
//2. Define a base class Person and a derived class employee with single inheritance. Define
//SetData() member functions in each of the class with different signatures to set the data
//members and demonstrate overloading of member functions. Define GetData() member
//functions in each of the class with same signatures to display data and demonstrate overriding
//of member functions.
public class Driver {

	public static void main(String[] args) {
		Person p =new Person();
		p.set("ram",123, "hyd");
		System.out.println("person details : ");
		p.get();
		
		employee e = new employee();
		e.set("raju",321,"pune",10000,"software");
		System.out.println("Student details : ");
		e.get();
		
		

	}

}
