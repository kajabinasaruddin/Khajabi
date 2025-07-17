package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.Function;
public class Lambda_Expression_using_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Function<Integer, Integer> f1 = (Integer n) -> {
            return n;
        };
        Integer i = f1.apply(num1);
        System.out.println(i);
    }
}
