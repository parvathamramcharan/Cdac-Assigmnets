package assigment10;
//Problem 3: Null Pointer Exception
//Task: Write a program that initializes a string variable to null and
//then tries to call a method on it. Use a try block to call the method
//and a catch block to handle the NullPointerException. Ensure a
//finally block prints a message indicating the operation is complete
public class Problem3 {

	public static void main(String[] args) {
		String s = null;
		try {
     		System.out.println("length of : "+s.length());
			//throw new NullPointerException("null");
		}
		catch(NullPointerException e) {
		System.err.println(e);
		}
		finally {
			System.out.println("operation is done....");
		}

	}

}
