package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
public class Method_reference_Example_using_Consumer_and_BiConsumer {
    public void disp(Integer n) {
        System.out.println("number = " + n);
    }
    public void dis(Integer n1,Integer n2){
        System.out.println(n1+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Consumer<Integer> c1 = new Method_reference_Example_using_Consumer_and_BiConsumer()::disp;
        c1.accept(n);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        BiConsumer<Integer,Integer>c2=new Method_reference_Example_using_Consumer_and_BiConsumer()::dis;
        c2.accept(n1,n2);
    }
}
