package Assignment5;
import java.util.Scanner;
public class DecToBinary {
    public static String binary(int n){
        String c="";
        while(n>0){
            int digit=n%2;
            c=c+digit;
            n=n/2;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(binary(n));
    }
}
