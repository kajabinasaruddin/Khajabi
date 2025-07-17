package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.Consumer;
public class Lambda_Expression_using_Consumer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Consumer<Integer>cs=(Integer n1)->{
            if(n1%2 == 0){
                System.out.println("even numbers::");
            }
            else{
                System.out.println("odd numbers::");
            }
        };
        cs.accept(num1);
    }
}
