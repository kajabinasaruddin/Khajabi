package Assignment2;

import java.util.Scanner;

public class AgeVerification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int n =sc.nextInt();
        if(n >= 18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");
        }
    }
}
