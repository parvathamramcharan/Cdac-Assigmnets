package problem6;
//Problem 6: Interface Inheritance - Create an interface Shape with methods draw() and
//calculateArea(). Create another interface Colorful that extends Shape and adds a
//method fillColor(). Implement these interfaces in the class Circle.
public class Driver {

	public static void main(String[] args) {
	   Circle c = new Circle(2.5);
	   c.draw();
	   c.fillCOlor("red");
	   c.calculateArea();
	   
	   
	   
	}

}
