//Program to find sum of sqaures of odd index values
import java.util.*;
public class sum_squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n;i++){
            arr[i]= scanner.nextInt();
        }
        int sum =0 ,sqaure=0;
        for(int i =1; i < n;i=i+2){
            sqaure = arr[i]*arr[i];
            sum += sqaure;
        }
        System.out.println(sum);
    }
}
