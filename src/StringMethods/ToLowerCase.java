package StringMethods;
import java.util.Scanner;
public class ToLowerCase {
    public static void main(String[] args){
        //convert upper case  2 lower case
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first String:");
        String name=sc.nextLine();
        System.out.println("enter a second string");
        String name1=sc.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name1.toLowerCase());
    }
}