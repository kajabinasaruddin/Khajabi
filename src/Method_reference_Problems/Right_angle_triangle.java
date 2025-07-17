package Method_reference_Problems;
import java.util.Scanner;
import java.util.function.Consumer;
public class Right_angle_triangle {
    public void hello(int n){
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Consumer<Integer> f=new Right_angle_triangle()::hello;
        f.accept(n);
    }
}