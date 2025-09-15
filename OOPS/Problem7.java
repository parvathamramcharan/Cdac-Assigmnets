// 7.Using this in Constructors:
// Create a class Rectangle with attributes length and width.
//  Implement a parameterized constructor that initializes these attributes. 
//  Use this to differentiate between class variables and constructor parameters. 
//  Include methods to calculate the area and perimeter.
class Rectangle{
    int length;
    int width;
    Rectangle(int l , int w){
        this.length= l;
        this.width = w;
    }
    void get(){
        System.out.println("length : "+this.length);
        System.out.println("width : "+this.width);
    }
    void calculate(){
        int perimeter = 2*(length+width);
        double area = length*width;
        System.out.println("Perimeter : "+perimeter);
        System.out.println("Area "+area);
    }
}
public class Problem7 {
    public static void main(String[] args) {
        Rectangle r1  = new Rectangle(2, 3);
        r1.get();
        r1.calculate();
    }
}
