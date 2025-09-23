package assigment10;

import java.io.IOException;
import java.util.Scanner;
public class tryResource {

	public static void main(String[] args) throws IOException {
		try(Scanner scanner = new Scanner(System.in)){
			String s = scanner.next();
			int n = Integer.parseInt(s);
			System.out.println("converted....");
			System.out.println("operation is done....");
		}

	}

}
