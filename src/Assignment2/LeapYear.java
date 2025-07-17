package Assignment2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(n % 4 == 0 && n%100 != 0 || n%400 ==0){
            //Except if it is also divisible by 100, then it is not a leap year →
            //(e.g., 1700, 1800, 1900 are NOT leap years)
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
