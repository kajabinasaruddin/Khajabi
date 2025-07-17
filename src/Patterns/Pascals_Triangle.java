package Patterns;
import java.util.Scanner;
public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        for(int i=0;i<=n;i++) {
            for(j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            int nums=1;
            for(int k=0;k<=i;k++){
                System.out.print(nums+" ");
                nums=nums*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
