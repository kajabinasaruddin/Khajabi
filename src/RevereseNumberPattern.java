import java.util.Scanner;

public class RevereseNumberPattern
{
    public static void main(Project5[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a pattern");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println("");

        }

    }
}
