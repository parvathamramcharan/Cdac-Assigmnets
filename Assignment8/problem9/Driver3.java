package assigment8;

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
