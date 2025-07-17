package TryCatchMethod;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
        int result=10/0;
        System.out.println("This line will NOT be executed.");
    }
}
