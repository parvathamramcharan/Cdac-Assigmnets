//bubble sort 
import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i <  n ;i++){
            arr[i]= scanner.nextInt();
        }
        for(int i= 0 ;i < n-1;i++){
            for(int  j =0 ; j < n-i-1;j++){
                if( arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("after sorting(bubble sort) : ");
        for(int i =0 ; i < n  ;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
