package StringMethods;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        //charAt(index)
        //  charAt() will take index as i/p and give corresponding character as o/p
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name.charAt(5));
    }
}
