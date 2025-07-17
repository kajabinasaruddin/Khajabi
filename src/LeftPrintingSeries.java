import java.util.Scanner;

public class LeftPrintingSeries
{
    public static void main(Project5[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num +"");
                num++;
            }
            System.out.println("");
        }
    }
}