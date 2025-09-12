//pattern 3
// n = 5;
//         *
//       * * 
//     * * *  
//   * * * * 
// * * * * *
public class StarPattern3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i =1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ;j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
