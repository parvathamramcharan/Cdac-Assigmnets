// 2. Electricity Bill Calculation
// Problem Statement:
// Write a program that calculates the electricity bill based on the number
// of units consumed. The charges per unit are:
// Up to 100 units: ₹5 per unit
// 101 to 200 units: ₹6 per unit
// 201 to 300 units: ₹7 per unit
// Above 300 units: ₹8 per unit

package aug10;

import java.util.*;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        if (units < 0 || units > 1000) {
            System.out.println("Invalid");
            return;
        }
        int bill = 0;
        switch (units / 100) {
            case 0:
                bill = units * 5;
                break;
            case 1:
                bill = (100 * 5) + (units - 100) * 6;
                break;
            case 2:
                bill = (100 * 5) + (100 * 6) + ((units - 200) * 7);
                break;
            default:
                bill = (100 * 5) + (100 * 6) + (100 * 7) + ((units - 300) * 8);
        }
        System.out.println("bill is : " + bill);
    }
}
