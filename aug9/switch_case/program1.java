package aug9_switchCase;
// Problem 1: Days of the Week
// Task: Write a program that takes an integer input (1-7) from the user and
// prints the corresponding day of the week using a switch statement.

import java.util.*;

public class program1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int day = sc.nextInt();
        
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}
