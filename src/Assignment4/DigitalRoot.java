package Assignment4;
import java.util.Scanner;
public class DigitalRoot {
    //Write a program that computes the digital root of a non-negative integer ( n )
    // by repeatedly summing its digits until only one digit remains.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=10){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum=sum+digit;
                n/=10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}