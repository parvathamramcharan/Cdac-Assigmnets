//pattern 7;
// n = 5
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
public class NumberPattern2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count;
        for(int i = 1 ; i <= n ;i++){
            count = i;
            for(int j =1 ; j <= i; j++){
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
