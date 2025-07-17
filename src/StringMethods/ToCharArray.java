package StringMethods;
import java.util.Scanner;
public class ToCharArray {
    public static void main(String[] args) {
        //convert String to char array
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name.toCharArray());
    }
}
