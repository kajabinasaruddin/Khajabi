import java.util.Scanner;

public class PalindromeNumber {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a pattern");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0 )
        {
            int digit=n%10;
            sum=(sum*10)+digit;
            n=n/10;
        }
        if(temp == sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
