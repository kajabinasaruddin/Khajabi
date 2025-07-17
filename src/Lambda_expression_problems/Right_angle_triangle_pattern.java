package Lambda_expression_problems;
import java.util.Scanner;
public class Right_angle_triangle_pattern {
    @FunctionalInterface
    interface Hello {
        public void hello(int n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Hello h=(int a)->{
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        };
        h.hello(n);
    }
}
