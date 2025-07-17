import java.util.Scanner;

public class FibbanociSeries {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+ " ,"+ b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(" , " +c);
            a=b;
            b=c;
        }
    }
}