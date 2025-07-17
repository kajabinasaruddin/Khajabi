package StringMethods;
import java.util.Scanner;
public class LengthMethod {
    public static void main(String[] args) {
        //gives number of characters in given String
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String name=sc.nextLine();
        System.out.println(name.length());
    }
}