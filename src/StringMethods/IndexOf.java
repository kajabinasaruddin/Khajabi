package StringMethods;
import java.util.Scanner;
public class IndexOf {
    public static void main(String[] args) {
        //indexOf()
        //  gives first occurance of given character
        Scanner sc=new Scanner(System.in);
        System.out.println("entre a string");
        String name=sc.nextLine();
        char ch=sc.next().charAt(0);
        int index=name.indexOf(ch);
        System.out.println(index);
    }
}
