package problem6;

public class Circle implements Colorful{
     private double radius;
     public Circle(double radius) {
    	 this.radius=radius;
     }
	public void draw() {
		System.out.println("draws...");
	}
	public void calculateArea() {
		double area = 3.14*radius*radius;
		System.out.println("area : "+area);
	}
	@Override
	public void fillCOlor(String color) {
        System.out.println("Filling the circle with color: " + color);
	}

}
