//1. Write a program to check if a given number is positive, negative, or zero.
package aug9;
import java.util.*;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if( num  > 0){
            System.out.println(num+" is a positive");
        }
        else if( num < 0){
            System.out.println(num+" is a negative");
        }
        else{
            System.out.println(num+" is a zero");
        }

    }
}
