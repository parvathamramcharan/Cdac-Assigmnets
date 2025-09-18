package abstraction1;

public class Student extends Person {
       public void eat() {
    	   System.out.println("eat");
       }
       @Override
       public void talk() {
    	   System.out.println("speaks french");
       }
       //child specific method
       public void study() {
    	   System.out.println("study java");
       }
}
