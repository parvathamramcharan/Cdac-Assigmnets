package assigment8;

//Problem 9: Anonymous Inner Class Extending an Abstract Class - Create an abstract
//class Shape with an abstract method draw(). Write a method createShape() in another
//class that uses an anonymous inner class to extend Shape and provides an
//implementation for the draw() method
public class Driver3 {
	public void createShape() {
	Shape s = new Shape() {
		public void draw() {
			System.out.println("drawing...");
		}
	};
	s.draw();
	}

	public static void main(String[] args) {
		Driver3 d = new Driver3();
		d.createShape();

	}


}
