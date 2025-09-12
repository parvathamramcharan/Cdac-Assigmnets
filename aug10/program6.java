//Write a program to print the Fibonacci series up to a given number of terms.
import java.util.*;
public class program6 {
    public static ArrayList<Integer> result(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        int num1 = 0;
        int num2=1;
        int num3;
        arr.add(num1);
        arr.add(num2);
        num = num-2;
        while(num-- > 0){
            num3=num1+num2;
            arr.add(num3);
            num1 = num2;
            num2 = num3;
        }
        return arr;
    }
    public static void main(String[] args) {
    //int num = Integer.parseInt(args[0]);
    Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    ArrayList<Integer> res = result(num);
    for(int i : res){
        System.out.print(i+" ");
    }
    sc.close();
    }
    
}
