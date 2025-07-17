package StringMethods;
import java.util.Scanner;
public class ConcatMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first string:");
        String name=sc.nextLine();
        System.out.println("enter a second number:");
        String name1=sc.nextLine();
        System.out.println(name.concat(name1));
    }
}