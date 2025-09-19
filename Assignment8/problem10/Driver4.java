package assigment8;
//Problem 10: Anonymous Inner Class Extending a Regular Class - Create a class Printer
//with a method printMessage(). Write a method createPrinter() in another class that uses
//an anonymous inner class to extend Printer and overrides the printMessage() method.
public class Driver4 {
    public void createPrinter() {
    	Printer p = new  Printer() {
    		
    		@Override
    		public void printMessage() {
    			System.out.println("overriden printing message.....");
    		}
    	};
    	p.printMessage();
    }
    public static void main(String[] args) {
		Driver4 d = new Driver4();
		d.createPrinter();
	}
   
}
