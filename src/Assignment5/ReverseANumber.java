package Assignment5;
import java.util.Scanner;
public class ReverseANumber {
    public static int reverseNumber(int n) {
        int reverse=0;
        int sign=1;
        if(n<0){
            sign=-1;
            n=-n;
        }
        while(n>0) {
            int digit = n%10;
            reverse=(reverse*10)+digit;
            n/=10;
        }
        return reverse*sign;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reversed = reverseNumber(n);
        System.out.println("Reversed number: " + reversed);
    }
}
