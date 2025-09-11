package aug9_switchCase;
// Problem 5: Month Days
// Write a program that takes an integer input (1-12) representing a month 
// and prints the number of days in that month (not a leap year).

import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month) {
            case 1: System.out.println("January has 31 days"); break;
            case 2: System.out.println("February has 28 days"); break; // not leap year
            case 3: System.out.println("March has 31 days"); break;
            case 4: System.out.println("April has 30 days"); break;
            case 5: System.out.println("May has 31 days"); break;
            case 6: System.out.println("June has 30 days"); break;
            case 7: System.out.println("July has 31 days"); break;
            case 8: System.out.println("August has 31 days"); break;
            case 9: System.out.println("September has 30 days"); break;
            case 10: System.out.println("October has 31 days"); break;
            case 11: System.out.println("November has 30 days"); break;
            case 12: System.out.println("December has 31 days"); break;
            default: System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }
    }
}
