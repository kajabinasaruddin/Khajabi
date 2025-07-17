package StringMethods;
import java.util.Scanner;
public class EqualsMethod {
    public static void main(String[] args) {
        //returns boolean value
        //   compare content by considering case
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a first string");
        String name=sc.nextLine();
        System.out.println("enter a second string");
        String name1=sc.nextLine();
        System.out.println(name.equals(name1));
    }
}
