package StringMethods;
import java.util.Scanner;
public class LastIndexOf {
    public static void main(String[] args) {
        //lastIndexOf()
        //  gives last occurance of given character
        Scanner sc=new Scanner(System.in);
        System.out.println("entre a string");
        String name=sc.nextLine();
        char ch=sc.next().charAt(0);
        int index=name.lastIndexOf(ch);
        System.out.println(index);
    }
}
