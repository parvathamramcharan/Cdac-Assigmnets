//3.Calculate the area of a circle given its radius using the formula: A = π * r^2.
import java.util.*;

public class program3 {
    public static void main(String[] args) {
        Double  radius = Double.parseDouble(args[0]);
        Double area = Math.PI * (radius*radius);
        System.out.println(area);
    }
}
