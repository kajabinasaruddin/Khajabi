import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(Project5[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int reverse=0;
        while(n != 0){
            int digit=n%10;
            reverse= (reverse*10)+digit;
            n/=10;
        }
        System.out.print( reverse );

    }
}
