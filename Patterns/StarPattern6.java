//pattern 6
// diamond
// n = 5
//          *
//        *   * 
//      *   *   *
//    *   *   *   *
//  *   *   *   *   *
//    *   *   *   *
//      *   *   * 
//        *   *
//          *

public class StarPattern6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        spaces = 1;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
