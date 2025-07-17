import java.util.Scanner;

public class Numberspattern {
    public static void main(Project5[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
/* 1
   22
   333
   4444
   55555
 */