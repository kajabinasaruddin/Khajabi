package Java_8_features_and_predefined_methods;
import java.util.Scanner;
public class Lambda_Expression_using_leap_year {
    public static void main(String[] args) {
        Functional_interface_leap_year f=(int a)->{
            if((a%4==0 || a%400 ==0) && (a%100!=0)){
                System.out.println("leap year");
            }
            else{
                System.out.println("not leap year");
            }
        };
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        f.leap(a);
    }
}
