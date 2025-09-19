package problem3;

public class Employee extends Person{
        private double salary;
        public void setSalary(double salary) {
            this.salary=salary;
        }
        @Override
        public void display() {
        	super.display();
        	System.out.println(salary);
 
        }
}
 
