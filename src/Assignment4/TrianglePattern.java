package Assignment4;
import java.util.Scanner;
public class TrianglePattern {
    //Triangle Pattern: Create a program that prints a triangle pattern using asterisks (*). For example, for ( n = 5 )
    public static void main(String[] args) {
        System.out.println("enter a pattern number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
