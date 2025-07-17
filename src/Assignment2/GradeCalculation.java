package Assignment2;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a percentage score: ");
        int n = sc.nextInt();

        // Corrected grading conditions
        if (n >= 90 && n <= 100) {
            System.out.println('A');
        } else if (n >= 80 && n < 90) {
            System.out.println('B');
        } else if (n >= 70 && n < 80) {
            System.out.println('C');
        } else if (n >= 60 && n < 70) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
