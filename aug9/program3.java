package aug9;
// Write a program to check if a given character is a vowel or a consonant.
import java.util.*;
public class program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {  // check alphabet
            if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u' ||
                ch == 'A' || ch == 'E' || ch=='I' || ch =='O' || ch=='U') {
                System.out.println("It's a vowel");
            } else {
                System.out.println("It's a consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
