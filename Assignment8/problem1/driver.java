package problem1;
//Problem 1: Create an abstract class Shape with an abstract method double area().
//Then, create two subclasses, Circle and Rectangle, that extend Shape and provide
//implementations for the area method. Write a main method to create instances of Circle
//and Rectangle, and display their areas.
public class Driver {
     public static void main(String[] args) {
		Circle c = new Circle(2.5);
		
		Rectangle r = new Rectangle(2.5,10);
		
		System.out.println("Area of circle : "+c.area());
		System.out.println("Area of Rectangle : " +r.area());
	}
}
