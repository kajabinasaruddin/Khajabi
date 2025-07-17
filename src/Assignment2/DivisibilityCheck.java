package Assignment2;

import java.util.Scanner;

public class DivisibilityCheck {
    /* Write a program that checks whether a number is divisible by both 3 and 5. */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if( n %3 ==0 && n%5 == 0){
            System.out.println("this number is divisible by 3 and 5");
        }
        else{
            System.out.println("this number is not divisible by 3 and 5");
        }
    }
}
