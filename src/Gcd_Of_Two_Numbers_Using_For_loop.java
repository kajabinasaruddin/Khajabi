import java.util.Scanner;
public class Gcd_Of_Two_Numbers_Using_For_loop {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int gcd=1;
        for(int i=a%b;i<Math.min(a,b);i++){
            gcd=i;
        }
        System.out.println(gcd);
    }
}