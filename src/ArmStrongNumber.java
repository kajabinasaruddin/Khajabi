import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(temp == sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
