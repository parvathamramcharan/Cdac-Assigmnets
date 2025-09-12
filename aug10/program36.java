//37. write a program to find the sum of digits of a given number until the sum its single digit
import  java.util.*;
public class program36 {
    public static int sigleDigit(int num){
        if(num%9==0) return 9;
        return (num%9);
    }
   public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);
    int num = scanner.nextInt();
     System.out.print(sigleDigit(num));
   } 
}
