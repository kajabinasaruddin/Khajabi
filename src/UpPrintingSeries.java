import java.util.Scanner;

public class UpPrintingSeries {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a pattern");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
