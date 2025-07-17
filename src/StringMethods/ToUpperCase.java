package StringMethods;
import java.util.Scanner;
public class ToUpperCase {
    public static void main(String[] args) {
        //convert lowercase String 2 upper case
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first String:");
        String name = sc.nextLine();
        System.out.println("enter a second string");
        String name1 = sc.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name1.toUpperCase());
    }
}