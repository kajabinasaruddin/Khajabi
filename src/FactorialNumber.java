import java.util.Scanner;

public class FactorialNumber {
    public static void main(Project5[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i,factorial=1;
        for(i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}