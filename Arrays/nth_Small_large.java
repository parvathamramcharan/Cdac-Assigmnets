//Program to find nth largest / smallest element in array
import java.util.*;
public class nth_Small_large {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        int k =scanner.nextInt();
        int nthSmallest = arr[n-k];
        int nthLargest= arr[k-1];
        System.out.println(k + "th smallest element: " + nthSmallest);
        System.out.println(k + "th largest element: " + nthLargest);
    }
}
