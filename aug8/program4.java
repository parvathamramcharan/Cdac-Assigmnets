//.Compute the hypotenuse of a right triangle using the Pythagorean theorem: c = sqrt(a^2 + b^2).
import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Math.sqrt((a*a )+ (b*b));
        System.out.println(c);

    }
}
