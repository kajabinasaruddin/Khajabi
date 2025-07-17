package Assignment5;

import java.util.Scanner;

public class ReverseOfNumberUsingTernaryOperator {
    public static int ReverseNumber(int n){
        int reverse=0;
        int sign=(n<0)?-1:1;
        n=sign*n;
        while(n>0){
            int digit=n%10;
            reverse=(reverse*10)+digit;
            n/=10;
        }
        return reverse*sign;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int reversed = ReverseNumber(n);
        System.out.println(reversed);
    }
}
