package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.BiConsumer;
public class Bi_consumer_method_interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nn=sc.nextInt();
        BiConsumer<Integer,Integer >b1=(Integer n1,Integer n2) -> {
            System.out.println(n1+n2);
        };
        b1.accept(n,nn);
    }
}