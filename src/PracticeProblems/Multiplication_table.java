package PracticeProblems;
import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+ j +" = " +(i*j));
            }
            System.out.println("");
        }
    }
}