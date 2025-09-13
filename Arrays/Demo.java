import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int choice = scanner.nextInt();

        for (int i = 0; i < 100; i++) {
            arr[i] = 1 + (int) (Math.random() * 101);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int sum = 0, avg;
        for (int i : arr) {
            sum += i;
        }
        avg = (int) (sum / arr.length);
        System.out.println("sum is : " + sum + " avg is : " + avg);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min is : " + min + " , max is : " + max);

    }
}
