import java.util.Scanner;

public class IncrementPattern {
    public static void main(Project5[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}
/*
*****
 ****
  ***
   **
    *
 */