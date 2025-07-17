package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.Consumer;
public class Consumer_method_interfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Consumer<Integer> c1 = (Integer n1) ->{
            if(n1%2==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        };
        c1.accept(n);
    }
}