package problem1;

public class Box3d extends Box {
	private int height;
	public Box3d(int length, int breadth, int height) {
		super(length, breadth);
		this.height=height;
	}
	public void calVol() {
		int l = getLength();
		int b = getBreadth();
		System.out.println("volume is : "+(l*b*height));
	}
	
	
   
    
}
