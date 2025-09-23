package assigment10;
//Problem5: Nested Try Blocks with Multiple Exceptions
//Task: Write a program that demonstrates the use of nested try
//blocks. The program should perform the following tasks:
//try should have two separate try blocks.
//In the first nested try:
//Divide two integers, handling any potential ArithmeticException.

//Within the second try block, initialize an array and attempt to
//access an out-of-bounds index, handling the
//ArrayIndexOutOfBoundsException.
//Ensure that appropriate messages are printed for each exception,
//and that a final message is printed indicating the completion of
//the operation.
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int num1= scanner.nextInt();
			int num2 = scanner.nextInt();
			try {
			   int div = num1/num2;
			   System.out.println("divison num1/num2 : "+div);
			}
			catch(ArithmeticException e) {
				System.err.println(e);
			}
			try {
				int[] arr = new int[5];
				arr[7]=567;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		catch(NumberFormatException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Completed the operations....");
		}

	}

}
