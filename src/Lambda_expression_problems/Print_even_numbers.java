package Lambda_expression_problems;
import java.util.Scanner;
public class Print_even_numbers {
    @FunctionalInterface
    interface Hello{
        public  void even(int a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Hello h=(int a)->{
            for(int i=0;i<=a;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        };
        h.even(num1);
    }
}
