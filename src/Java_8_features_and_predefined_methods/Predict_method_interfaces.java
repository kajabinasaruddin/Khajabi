package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.Predicate;
public class Predict_method_interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Predicate<Integer>p1=(Integer num)->{
            if(num%2==0){
                return true;
            }
            else{
                return false;
            }
        };
       boolean b=p1.test(n);
        System.out.println(b);
    }
}