//. Write a program to find the largest of three numbers entered by the user.
package aug9;
import java.util.*;
public class program4 {
    public static int result(int num1 ,int num2, int num3){
        if(num1 > num2){
            if(num1 > num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        else{
            if(num2 > num3){
                return num2;
            }
            else{
                return num3;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int large = result(a,b,c);
         System.out.println("Maximum of " + a + ", " + b + ", " + c + " is " + large);
    }
}
