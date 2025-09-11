//Convert a temperature from Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32
import java.util.*;
public class program2 {
    public static void main(String[] args) {
        Double celsius = Double.parseDouble(args[0]);
        Double Fahrenheit = (celsius * (9/5))+ 32;
        System.out.println(Fahrenheit);
    }
}
