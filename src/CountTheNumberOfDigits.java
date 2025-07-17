import java.util.Scanner;

public class CountTheNumberOfDigits {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  number");
        int n=sc.nextInt();
        int count=0;
        while(n != 0){
            n/=10;
           count = count + 1;
        }
        System.out.println(count);
    }
}
