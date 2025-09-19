package problem4;

public class Employee extends Person{
	private int empID;
	private double salary;
    Employee(String name ,int age, int empID, double salary){
    	super(name,age);
    	this.empID=empID;
    	this.salary= salary;
    }
    @Override
    public void display() {
    	super.display();
    	System.out.println("empID : "+empID);
    	System.out.println("salary : "+salary);
    }
}
