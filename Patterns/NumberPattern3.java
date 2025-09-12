//pattern 8
// n = 5
//         1
//       1 2
//     1 2 3
//   1 2 3 4
// 1 2 3 4 5
public class NumberPattern3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count;
        for(int i = 1; i <= n ;i++){
            for(int j = 1; j <= n-i;j++){
                System.out.print("  ");
            }
            count=1;
            for(int k = 1 ; k <=i ;k++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
