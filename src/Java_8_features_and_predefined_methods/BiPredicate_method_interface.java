package Java_8_features_and_predefined_methods;
import java.util.Scanner;
import java.util.function.BiPredicate;
public class BiPredicate_method_interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        BiPredicate<Integer,Integer> s=(Integer s1,Integer s2)->{
            if(s1>s2){
                return true;
            }
            else{
                return false;
            }
        };
        boolean name=s.test(n,n1);
        System.out.println(name);
    }
}
