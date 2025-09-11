//5.Calculate the simple interest on an investment using the formula: A = P * T * R / 100; 
import java.util.*; 
public class program5 { 
    public static void main(String[] args) {
    Double p = Double.parseDouble(args[0]);
    Double t = Double.parseDouble(args[1]);
    Double r = Double.parseDouble(args[2]);
    Double a = (p*r*t)/100; System.out.println(a);
 }
}