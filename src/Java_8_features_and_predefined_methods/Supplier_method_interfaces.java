package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.Supplier;
public class Supplier_method_interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Supplier<Integer>s1=()->n;
        Integer n2=s1.get();
        System.out.println(n2);
    }
}
