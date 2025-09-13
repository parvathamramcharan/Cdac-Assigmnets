
//addition of matrix
import java.util.*;

public class AddMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        int[][] arr1 = new int[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] arr2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        if (rows1 == rows2 && cols1 == cols2) {
            int[][] arr3 = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("add of mat is");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.print("Addition is not possible");
        }

    }
}