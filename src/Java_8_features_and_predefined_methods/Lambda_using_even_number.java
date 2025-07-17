package Java_8_features_and_predefined_methods;
import java.util.Scanner;
public class Lambda_using_even_number {
    public static void main(String[] args) {
        Functional_interface_even_number f = (int a) ->
            //int n=10;
            System.out.println((a % 2 == 0) ? "0" : "1");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        f.even(a);
    }

}
