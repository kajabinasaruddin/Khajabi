package Java_8_features_and_predefined_methods;
import java.util.Scanner;
public class Lambda_expression_positive_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Functional_interface_Positive_numbers f=(int n)->{
            if(n>0){
                System.out.println("positive");
            }
            else if(n<0){
                System.out.println("negative");
            }
            else{
                System.out.println("zero");
            }
        };
        f.pos(a);

    }
}
