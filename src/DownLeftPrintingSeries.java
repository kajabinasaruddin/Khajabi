import java.util.Scanner;

public class DownLeftPrintingSeries {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a pattern");
        int num =1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(num +" ");
                num++;
            }
            for(int k=1;k<=i;k++){
                System.out.print("");
            }
            System.out.println("");
        }
    }
}
