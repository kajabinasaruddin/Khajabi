package Assignment5;
import java.util.Scanner;
public class CountTheDigitsNumbers {
    public static int count(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
