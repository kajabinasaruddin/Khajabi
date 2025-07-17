import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1st number:");
            int n1 = sc.nextInt();
            System.out.println("enter 2nd number:");
            int n2 = sc.nextInt();
            System.out.println("prime numbers");
            for (int n = n1; n <= n2; n++)
            {
                if (n == 1)
                {
                    System.out.print(" ");
                    continue;
                }
                if (n <= 3)
                {
                    System.out.print(n+" ");
                    continue;
                }
                if (n % 2 == 0 || n % 3 == 0)
                {
                    System.out.print("");
                    continue;
                }
                for (int i = 5; i <= n; i+=6)
                {
                    if (n % i == 0 || n % (i + 2) == 0)
                    {
                        System.out.print(n+" ");
                    } else
                    {
                        System.out.print("");
                    }
                }
            }
        }
}
