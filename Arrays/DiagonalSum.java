import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        if (r == c) {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < r; i++) {
                sum1 += arr[i][i];
                sum2 += arr[i][r - i - 1];
            }

            System.out.println("Diagonal sums is " + sum1 + " , " + sum2);
        } else {
            System.out.println("for this matrix No diagonal possible");
        }
    }
}
