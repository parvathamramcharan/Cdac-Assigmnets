//pattern 8
//hallow diamond
// n= 5;
//         *
//       *   *
//     *       *
//   *           *
// *               *
//   *           *
//     *       *
//       *   *
//         * 
public class StarPattern8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int spaces = n - 1;
        int spaces2 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            spaces--;
            System.out.print("*");
            for (int k = 1; k <= spaces2; k++) {
                System.out.print("  ");
            }
            spaces2 += 2;
            if (i != 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        spaces = 1;
        spaces2 = (n - 2) * 2;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            spaces++;
            System.out.print("*");
            for (int k = 1; k <= spaces2; k++) {
                System.out.print("  ");
            }
            spaces2 -= 2;
            if (i != n - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
