package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
public class Method_reference_Example_using_Function_and_BiFunction {
    public Integer disp(Integer n1){
        return n1;
    }
    public Integer dis(Integer n2,Integer n3){
        return n2+n3;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        Function<Integer,Integer>f1=new Method_reference_Example_using_Function_and_BiFunction()::disp;
        Integer m1=f1.apply(n1);
        System.out.println(m1);
        int n2= s.nextInt();
        int n3=s.nextInt();
        BiFunction<Integer,Integer,Integer> f2=new Method_reference_Example_using_Function_and_BiFunction()::dis;
        Integer m2=f2.apply(n2,n3);
        System.out.println(m2);
    }
}
