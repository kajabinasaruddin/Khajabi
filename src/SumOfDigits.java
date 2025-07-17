import java.util.Scanner;
public class SumOfDigits {
    public static void main(Project5[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }
    }
}