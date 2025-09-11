//Convert a distance from kilometers to miles
// using the formula: miles = kilometers * 0.621371.
import java.util.*;
public class program8 {
    public static void main(String[] args) {
        Double km = Double.parseDouble(args[0]);
        Double miles = km * 0.621371;
        System.out.println(miles);
    }
}
