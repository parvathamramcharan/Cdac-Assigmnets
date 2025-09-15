import java.util.*;
public class reverse {
    public static void reverse(int[] arr){
        int n =arr.length;
        int t = n >> 1;
        for(int i = 0 ;i < t ;i++){
            int temp =arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ;i++){
            arr[i]= scanner.nextInt();
        }
        reverse(arr);
        for(int i =0 ; i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
