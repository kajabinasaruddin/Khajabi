import java.util.Scanner;

public class UsdConverter {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter usd currency");
        double usd=sc.nextDouble();
        if(usd <= 0){
            System.out.println("invalid");
        }
        System.out.println("enter target currency");
        System.out.println("1.Usd to euro");
        System.out.println("2.usd to pounds");
        System.out.println("3.usd to rupees");
        int choice =sc.nextInt();
        System.out.println("converted currency");
        if(choice == 1){
            System.out.println(usd * 0.85 +"erus");
        }
        else if(choice == 2){
            System.out.println(usd * 0.75 +"pounds");
        }
        else if(choice == 3){
            System.out.println(usd*85 +"rupees");
        }
        else{
            System.out.println("invalid choice");
        }
    }
}
