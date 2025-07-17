package Lambda_expression_problems;
import java.util.Scanner;
public class Swapp_the_number {
    interface Hello{
        public void hello(int a, int b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Hello h = (int num1, int num2) -> {
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println(num1);
            System.out.println(num2);
        };
        h.hello(a,b);
//        System.out.println(a);
//        System.out.println(b);
    }
}