package Assignment4;

import java.util.Scanner;

public class Pnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) { // Loop through numbers from 2 to n
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) { // Method to check if a number is prime
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / i; i++) { // Avoid using Math.sqrt()
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}