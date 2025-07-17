package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.BiFunction;
public class Lamdba_Expression_using_biFunctiuon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        BiFunction<Integer, Integer, Integer> bi = (Integer a, Integer b) -> {
            return a + b;
        };
        Integer num = bi.apply(num1, num2);
        System.out.println(num);
    }
}