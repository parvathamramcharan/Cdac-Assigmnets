//6.Calculate the compound interest on an investment
// using the formula: A = P * (1 + r/n)^(n*t).
import java.util.*;
public class program6 {
    public static void main(String[] args) {
        Double p = Double.parseDouble(args[0]);
        Double r = Double.parseDouble(args[1]) / 100;
        Double t = Double.parseDouble(args[2]);
        Double n = Double.parseDouble(args[3]);

        double A = p * Math.pow((1 + r / n), (n * t));
        Double CI = A - p;
        System.out.println("CI IS " + CI);
        System.out.println("final " + A);
    }
}
