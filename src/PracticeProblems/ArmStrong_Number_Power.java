package PracticeProblems;
import java.util.Scanner;
public class ArmStrong_Number_Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int count=s.length();
        System.out.println("count value:" +count);
        int sum=0;
        int temp=n;
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,count);
            n=n/10;
        }
        System.out.println("sum values:" +sum);
        if(sum==temp){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
