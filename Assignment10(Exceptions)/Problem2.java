package assigment10;
import java.util.*;
//Problem 2: Array Index Out of Bounds
//Task: Write a program that initializes an array of integers and tries
//to access an index that is out of bounds. Use a try block to access
//the array and a catch block to handle the
//ArrayIndexOutOfBoundsException. Ensure a finally block prints a
//message indicating the operation is complete
public class Problem2 {
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		try {
	    System.out.println("enter the elements :");
		int i=0;
		for( i=0; i < n ;i++) {
			arr[i]= scanner.nextInt();
		}
		arr[i+1]= 77;
		System.out.println("entered array is : ");
		for(i =0 ; i < n+1;i++) {
			System.out.print(arr[i]+" ");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("operation is done....");
		}
	}
}
