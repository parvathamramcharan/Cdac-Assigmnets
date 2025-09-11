//32. Write a program to check if a given string is a pangram.
//a pangram is string that contains all alphabets atleast once
package aug10;

import java.util.*;

public class program32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        int count = 0;
        boolean[] letters = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    count++;
                }
            }
        }
        if (count == 26) {
            System.out.println("The sentence is pangram");
        } else {
            System.out.println("The sentence is not pangram");
        }
    }
}
