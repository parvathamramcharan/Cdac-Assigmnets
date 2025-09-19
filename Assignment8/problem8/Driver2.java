package assigment8;
//Problem 8: Anonymous Inner Class Implementing an Interface - Create an interface
//Greeting with a method sayHello(). Write a method generateGreeting() in another class
//that uses an anonymous inner class to implement the Greeting interface and prints a
//greeting message
public class Driver2 {
    public void genarateGretting() {
    	Greeting g = new Greeting() {
    		public void sayHello() {
    			System.out.println("hwlloooooo");
    		}
    	};
    	g.sayHello();
    }
	
     public static void main(String[] args) {
		Driver2 d = new Driver2();
		d.genarateGretting();


	}

}
