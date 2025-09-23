package assigment10;
//Problem 1: Division by Zero
//Task: Write a program that takes two integers from the user and
//performs division. Use a try block to perform the division, and a
//catch block to handle the ArithmeticException in case of division
//by zero. Ensure that a finally block prints a message indicating
//that the operation is complete.
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int div = num1/num2;
			System.out.println("num1/num2 : "+div);
			//throw new ArithmeticException("division by zero error");
			
		}
		catch(ArithmeticException e) {
			System.err.println(e);
		}
		finally{
			System.out.println("Operation is complete....");
		}
	}

} 
 
