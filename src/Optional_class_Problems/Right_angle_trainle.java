package Optional_class_Problems;
import java.util.Optional;
import java.util.Scanner;
public class Right_angle_trainle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Optional<Integer>op=Optional.ofNullable(n);
        for(int i=1;i<= op.get();i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");

        }
    }
}