package StringMethods;

import java.util.Scanner;

public class EqualIIgnoranceCase {
    public static void main(String[] args) {
        // returns boolean value
        //   compare content by ignoring case
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first string:");
        String name=sc.nextLine();
        System.out.println("enter a second string:");
        String name1=sc.nextLine();
        System.out.println(name.equalsIgnoreCase(name1));
    }
}
