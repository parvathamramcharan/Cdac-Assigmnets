package aug9_switchCase;
// Problem 2: Simple Calculator
// Write a program that takes two integers and an operator (+, -, *, /) as input 
// and performs the corresponding operation using a switch statement.

import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+': 
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2)); 
                break;
            case '-': 
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2)); 
                break;
            case '*': 
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2)); 
                break;
            case '/': 
                if(num2 != 0) {
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            default: 
                System.out.println("Invalid operator! Please enter one of (+, -, *, /).");
        }
    }
}
