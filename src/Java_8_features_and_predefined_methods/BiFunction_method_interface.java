package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.BiFunction;
public class BiFunction_method_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BiFunction<Integer, Integer, Integer> f = (Integer num1, Integer num2) -> {
            return num1 + num2;
        };
        Integer n = f.apply(a, b);
        System.out.println(n);
    }
}