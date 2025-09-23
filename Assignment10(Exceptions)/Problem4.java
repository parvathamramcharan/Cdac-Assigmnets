package assigment10;
//Problem 4: Number Format Exception
//Task: Write a program that takes a string input from the user and
//tries to convert it to an integer. Use a try block to perform the
//conversion and a catch block to handle the
//NumberFormatException. Ensure a finally block prints a message
//indicating the operation is complete.
import java.io.IOException;
//Problem 4: Number Format Exception
//Task: Write a program that takes a string input from the user and
//tries to convert it to an integer. Use a try block to perform the
//conversion and a catch block to handle the
//NumberFormatException. Ensure a finally block prints a message
//indicating the operation is complete.
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		try {
			int n = Integer.parseInt(s);
			System.out.println("entered string : " + s);
//			throw new NumberFormatException("mismatched....");
		}
		catch(NumberFormatException e) {
			System.err.println(e);
		}
		finally{
			System.out.println("operation is done....");
		}
		

	}

}
