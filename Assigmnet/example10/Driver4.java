package assigment8;

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
