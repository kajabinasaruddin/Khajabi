package Method_reference_Problems;
import java.util.Scanner;
import java.util.function.Consumer;
public class Palindrome_number {
    public void palindrome(Integer n1){
        Integer temp=n1;
        int rev=0;
        while(n1>0){
            int digit=n1%10;
            rev=rev*10+digit;
            n1=n1/10;
        }
        if(temp==rev){
            System.out.println("palindrome::");
        }
        else{
            System.out.println("not palindrome::");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        Consumer<Integer>cs=new Palindrome_number()::palindrome;
        cs.accept(n1);
    }
}
