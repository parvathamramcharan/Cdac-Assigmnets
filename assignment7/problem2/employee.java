package Problem2;

public class employee extends Person {
        private int salary;
        private String designation;
        public void set(String name ,int id,String place,int salary,String designation) {
            super.set(name,id,place);
        	this.salary=salary;
        	this.designation=designation;
        }
        @Override
        public void get() {
        	super.get();
        	System.out.print(salary+" "+designation);
        }
}
 
