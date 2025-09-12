//PATTERN 9
//  n = 5
// 1 2 3 4 5
//   1 2 3 4
//     1 2 3
//       1 2
//         1
public class NumberPattern4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count=1;
        for(int i = n; i >= 1 ;i--){
            for(int j = 1; j <= n-i;j++){
                System.out.print("  ");
            }

            for(int k = 1; k <= i;k++){
                   System.out.print(count+" ");
                   count++;
            }
            count=1;
            System.out.println();
        }
    }
}
