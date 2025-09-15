import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ;i++){
            arr[i]= scanner.nextInt();
        }
        int key = scanner.nextInt();
        for(int i =0 ;i < n ;i++){
            if(arr[i]==key){
                System.out.println(key+" found at "+ i+ " index");
                return;
            }
        }
        System.out.println("key not found");
    }
}
