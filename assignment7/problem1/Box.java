package problem1;

public class Box {
      private int length;
      private int breadth;
      public Box() {
    	  
      }
      public Box(int length,int breadth) {
    	  this.length= length;
    	  this.breadth=breadth;
      }
      public void calArea() {
    	  System.out.println("area is :" +(length*breadth));
      }
      public int getLength() {
    	  return length;
      }
      public int getBreadth() {
    	  return breadth;
      }
   
}
