package Java_8_features_and_predefined_methods;
import java.util.Scanner;
public class Functional_interface_Example {
    interface Hello {
        public void hello(int a, int b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1::");
        int n1=sc.nextInt();
        System.out.println("enter n2::");
        int n2=sc.nextInt();
        Hello h=(int a,int b)->
        {
            System.out.println(a+b);
        };
        h.hello(n1,n2);
    }
}