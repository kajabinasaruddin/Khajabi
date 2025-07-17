import java.util.Scanner;
public class Gcd_Of_Two_numbers {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
