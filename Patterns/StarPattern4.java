//pattern 5
// n == 5
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         *
public class StarPattern4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = n ; i >= 1; i--){
            for(int j = 1 ; j <= n-i;j++){
                System.out.print("  ");
            }
            for(int k = i ; k >= 1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
