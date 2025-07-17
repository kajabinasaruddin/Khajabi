package Assignment5;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
                fact=fact*i;
        }
        System.out.println(fact);
        int sum=0;
        while(n>0){
        int digit=n%10;
        //sum=sum+fact(digit);
        n/=10;}
        System.out.println(sum);
    }

}
