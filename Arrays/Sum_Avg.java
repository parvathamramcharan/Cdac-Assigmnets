//sum and avg pf array elements
import java.util.*;
public class Sum_Avg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int[] arr  = new int[n];
        for(int i  =0 ; i < n;i++){
            arr[i]= scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0 ;i < n ;i++){
            sum += arr[i];
        }
        double avg = sum/n;
        System.out.println("Average : "+avg);
        System.out.println("Sum : "+sum);
    }
}
