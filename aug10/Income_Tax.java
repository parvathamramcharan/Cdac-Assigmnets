// 3. Income Tax Calculation
// Problem Statement:
// Write a program that calculates the income tax payable based on the annual salary:
// Income ≤ ₹2,50,000 → No tax
// ₹2,50,001 to ₹5,00,000 → 5% tax
// ₹5,00,001 to ₹10,00,000 → 20% tax
// Above ₹10,00,000 → 30% tax
package aug10;

import java.util.*;

public class Income_Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        double tax = 0.0;
        int slab;
        if (income <= 250000)
            slab = 0;
        else if (income <= 500000)
            slab = 1;
        else if (income <= 1000000)
            slab = 2;
        else
            slab = 3;

        switch (slab) {
            case 0:
                tax = 0.0;
                break;
            case 1:
                tax = (income - 250000) * 0.05;
                break;
            case 2:
                tax = (250000 * 0.05) + (income - 500000) * 0.20;
                break;
            case 3:
                tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
                break;
        }
        System.out.println("Income : " + income);
        System.out.println("Tax Payable : " + tax);

    }
}
