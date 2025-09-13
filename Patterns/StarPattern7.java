//pattern 7
//borders
//n= 5
//  * * * * *
//  *       *
//  *       *
//  *       *
//  * * * * *
public class StarPattern7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || i == 1 || j == n || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
