package Optional_class_Problems;
import java.util.Optional;
import java.util.Scanner;
public class Even_or_odd_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Optional<Integer> op1=Optional.ofNullable(n);
        if(op1.isPresent()){
            if(op1.get()%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }

    }
}
