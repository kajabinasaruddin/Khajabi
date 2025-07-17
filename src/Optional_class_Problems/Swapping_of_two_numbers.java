package Optional_class_Problems;
import java.util.Optional;
import java.util.Scanner;
public class Swapping_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Optional<Integer>op1=Optional.ofNullable(a);
        Optional<Integer>op2=Optional.ofNullable(b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
//        if(op1.isPresent()){
//            System.out.println(a);
//            System.out.println(b);
//        }
    }

}
