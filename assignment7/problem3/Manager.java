package problem3;

public class Manager extends Employee {
           private String department;
           public void setDepartment(String department) {
        	   this.department=department;
           }
           @Override 
           public void display() {
        	   super.display();
        	   System.out.println(department);
           }
}
