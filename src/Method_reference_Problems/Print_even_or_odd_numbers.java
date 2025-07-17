package Method_reference_Problems;
import java.util.Scanner;
import java.util.function.Consumer;
public class Print_even_or_odd_numbers {
    public void even(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Consumer<Integer> f1 = new Print_even_or_odd_numbers()::even;
        f1.accept(num1);
    }
}