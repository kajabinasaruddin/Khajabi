package Lambda_expression_problems;
import java.util.Scanner;
public class Print_even_or_odd_numbers {
    @FunctionalInterface
    interface Even {
        public void eveOrOdd(int a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Even e = (int n) -> {
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        };
        e.eveOrOdd(a);
    }
}