package problem3;
//3. Write a program to give example for multilevel inheritance in Java.
public class Driver {

	public static void main(String[] args) {	
		Manager m = new Manager();
		 m.setName("Ravi");
	     m.setSalary(60000);
	     m.setDepartment("IT");
         m.display();
	}

}
