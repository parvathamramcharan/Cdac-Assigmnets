//Determine the volume of a sphere given its radius 
//using the formula: V = (4/3) * π * r^3.
import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Double r = Double.parseDouble(args[0]);
        Double v = (4.0/3.0) * Math.PI * (r*r*r);
        System.out.println(v);

    }
}
