package Method_reference_Problems;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
public class Print_even_numbers {
    public void even(Integer n){
       for(int i=0;i<=n;i++){
           if(i%2==0){
               System.out.print(i+" ");
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Consumer<Integer> f1=new Print_even_numbers()::even;
        f1.accept(n);
    }
}
