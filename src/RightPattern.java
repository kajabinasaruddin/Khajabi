import java.util.Scanner;

public class RightPattern {
    public static void main(Project5[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a pattern");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            System.out.println("");
            for(j=0;j<i+1;j++){
                System.out.print("*");
            }
        }
        System.out.print("");
    }
}
