package Assignment5;
import java.util.Scanner;
public class LCMCalculation {
    public static int gcd(int a,int b){
        while(b!=0) {
            int temp = b;
            b= a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(lcm(num1,num2));
    }
}
