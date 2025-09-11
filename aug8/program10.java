
//10.Compute the area of a triangle given the lengths of its three sides
// using Heron's formula.
//The formula is as follows:
//s = (a + b + c) / 2
//A = sqrt(s * (s - a) * (s - b) * (s - c))
//where:
//a, b, and c are the lengths of the triangle's sides.
//s is the semi perimeter (half of the perimeter) of the triangle.
//A is the area of triangle
import java.util.*;

public class program10 {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle sides.");
            return;
        }
        Double s = (a + b + c) / 2;
        Double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(A);
    }
}