package Java_8_features_and_predefined_methods;
import java.util.Scanner;
public class lambda_expression_using_sumOfDigits {
    public static void main(String[] args) {
        Functional_interface_using_sumOfDigits f=(int a)->{
            int sum=0;
            while(a>0) {
                int digits = a % 10;
                sum += digits;
                a /= 10;
            }
            System.out.println(sum);
        };
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        f.sums(a);
    }
}
