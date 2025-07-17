package Optional_class_Problems;
import java.util.Optional;
import java.util.Scanner;
public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        Optional<Integer> op=Optional.ofNullable(n);
        int rev=0;
           while(op.get()>0){
               int digit=op.get()%10;
               rev=(rev*10)+digit;
               op=Optional.of(op.get()/10);
           }
           if(temp == rev){
               System.out.println("palindrome::");
           }
           else{
               System.out.println("not palindrome::");
           }
    }
}