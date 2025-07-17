import java.util.Scanner;

public class UsbConvertersAnotherMethod {
    public static void main(Project5[] args) {
        double USD_TO_INR = 83.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a amount");
        double usd = sc.nextDouble();
        if (usd > 0) {
            double inr = usd * USD_TO_INR;
            System.out.println(inr);
        } else {
            System.out.println("invalid");
        }
    }
}