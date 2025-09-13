import java.util.*;

public class MulMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        if (c1 == r2) {
            int[][] arr3 = new int[r2][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    arr3[i][j] = 0;
                    for (int k = 0; k < c1; k++) { // k < r2
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            // printing
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3[0].length; j++) {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("multiplication not possible");
        }

    }
}
