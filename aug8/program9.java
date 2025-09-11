//Calculate the sum of the first n natural numbers 
//using the formula: sum = (n * (n + 1)) / 2.

import java.util.*;
public class program9 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = (n * (n+1))/2;
        System.out.println(sum);
    }
}
