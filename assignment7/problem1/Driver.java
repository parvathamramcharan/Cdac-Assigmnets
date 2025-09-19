package problem1;
//1. Create class Box and Box3d. Box3d is extended class of Box. The above two classes going
//to fulfill the following requirement. Include constructor, set value of length, breadth, height. Find
//out area and volume.
public class Driver {
   public static void main(String[] args) {
	  Box b1 = new Box(10,20);
	  Box3d b2 = new Box3d(5,10,15);
	  
	  b1.calArea();   // area : 200 
	  b2.calVol();    // volume : 750
	  b2.calArea();  // area : 50
} 
}
