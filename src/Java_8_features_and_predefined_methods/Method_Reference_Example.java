package Java_8_features_and_predefined_methods;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Method_Reference_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        BiConsumer<Integer, Integer> f1 = (n1, n2) -> {
            if (n1 > n2) {
                System.out.println("n1 is big");
            } else {
                System.out.println("n2 is big");
            }
        };

        f1.accept(num1, num2);
    }
}
