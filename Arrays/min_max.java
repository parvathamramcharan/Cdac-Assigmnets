//min and max element of array
import java.util.*;


public class min_max {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr  = new int[n];
        for(int i =0 ; i < n;i++){
            arr[i]= scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i =0 ;i < n ;i++){
           if( arr[i] > max){
              max = arr[i];
           }
           if(arr[i] < min){
            min = arr[i];
           }
        }
        System.out.println("minimum number : "+min);
        System.out.println("maximum number : "+max);
    }
}
