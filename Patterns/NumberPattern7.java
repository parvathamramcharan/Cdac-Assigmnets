//pattern 7
// n =  7
// 1 2 3 4 5 6 7
//   1 2 3 4 5 6
//     1 2 3 4 5
//       1 2 3 4
//         1 2 3
//           1 2
//             1
//           1 2
//         1 2 3
//       1 2 3 4
//     1 2 3 4 5
//   1 2 3 4 5 6
// 1 2 3 4 5 6 7
public class NumberPattern7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int spaces = 0, count = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            spaces++;
            count = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        spaces = n - 2;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            spaces--;
            count = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
