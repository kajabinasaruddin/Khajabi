package Assignment4;
import java.util.Scanner;
public class ReverseOfNumber {
    //Write a program that takes an integer as input and outputs the number with its digits reversed.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        System.out.println(rev);
    }
}
