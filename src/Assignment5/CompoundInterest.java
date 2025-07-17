package Assignment5;
import java.util.Scanner;
public class CompoundInterest {
    public static double interest(double p,double r,int n,int t){
        double amount = p;
        amount= p*Math.pow(1+(+r/n),(n*t));
        return amount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle amount:");
        double p=sc.nextDouble();
        System.out.println("enter Annual Interest Rate:");
        double r=sc.nextDouble();
        System.out.println("enter Time Period:");
        int n=sc.nextInt();
        System.out.println("enter Final Amount:");
        int t=sc.nextInt();
        System.out.println(interest(p,r,n,t));
    }
}
