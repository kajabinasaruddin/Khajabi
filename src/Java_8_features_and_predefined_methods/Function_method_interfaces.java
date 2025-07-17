package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.Function;
public class Function_method_interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Function<Integer,String>f=(Integer num)->{
            if(num%2==0){
                return "Even Number";
            }
            else{
                return "Odd Number";
            }
        };
        String name=f.apply(n);
        System.out.println(name);
    }
}