package Assignment4;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int i;
        for( i=1;i<n;i++){
            System.out.print("");
        }
        for(int j=1;j<=10;j++){
            System.out.println(i + " x " + j + "=" + (i*j));
        }
    }
}