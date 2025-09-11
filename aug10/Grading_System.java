// 1. Grading System
// Problem Statement:
// Write a program that takes a student's percentage as input and
// assigns a grade based on the following criteria:
// 90% and above → A
// 80% to 89% → B
// 70% to 79% → C
// 60% to 69% → D
// Below 60% → F

package aug10;

import java.util.*;

public class Grading_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();

        if ((m1 <= 0 || m1 > 100) ||
                (m2 <= 0 || m2 > 100) ||
                (m3 <= 0 || m3 > 100)) {
            System.out.println("Invalid marks");
            return;
        }
        if (m1 <= 60 || m2 <= 60 || m3 <= 60) {
            System.out.println("Grade:F");
            return;
        }

        int avg = (m1 + m2 + m3) / 3;
        System.out.println("avg : " + avg);
        switch (avg / 10) {
            case 10:
            case 9:
                System.out.println("Grade : A");
                break;
            case 8:
                System.out.println("Grade : B");
                break;
            case 7:
                System.out.println("Grade : C");
                break;
            case 6:
                System.out.println("Grade : D");
            default:
                System.out.println("Fail : F");
                break;
        }

    }
}
