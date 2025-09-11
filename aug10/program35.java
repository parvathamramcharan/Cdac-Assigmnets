//perfect sqaure //4 9 16 25 64...
package aug10;

import java.util.*;

public class program35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Negative numbers cannot ");
        }
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect number");
        }
    }
}
