package Lambda_expression_problems;
import java.util.Scanner;
public class Palindrome_number {
    @FunctionalInterface
    interface PalindromeNumber{
        public void prime(int n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PalindromeNumber p=(int num) -> {
            int temp=num;
            int rev=0;
            while(num>0){
                int digit=num%10;
                rev=rev*10+digit;
                num/=10;
            }
            if(temp==rev){
                System.out.println("palindrome::");
            }
            else{
                System.out.println("not palindrome::");
            }
        };
        p.prime(n);
    }
}
