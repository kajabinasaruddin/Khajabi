package Assignment4;
import java.util.Scanner;
public class FactorialCalculationUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.print(fact + " ");
        }
    }
}
