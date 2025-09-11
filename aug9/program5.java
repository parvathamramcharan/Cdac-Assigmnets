package aug9;
//5. Write a program to check if a given number is even or odd.
import java.util.*;
public class program5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even");
        }
        else{
            System.out.println(num+" is a odd");
        }
    }
}
