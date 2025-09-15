//Program to find sum of first and second halfs of an array
import java.util.*;
public class sum_half {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i < n ;i++){
            arr[i]= scanner.nextInt();
        }
        int t = n/2;
        int sum1=0,sum2=0;
        for(int i =0 ; i < t;i++){
            sum1 += arr[i];
        }
        for(int i = t ; i < n;i++){
            sum2 += arr[i];
        }
        System.out.println("sum of first half : "+sum1);
        System.out.println("Sum of second half : "+sum2);
    }
}
