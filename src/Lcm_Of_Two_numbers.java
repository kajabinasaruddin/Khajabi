import java.util.Scanner;
public class Lcm_Of_Two_numbers {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int num1=a;
        int num2=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}
