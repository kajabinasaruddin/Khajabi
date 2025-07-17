package Babu_sir_work_Practice_Strings;
import java.util.Scanner;
public class Swapping_with_two_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        name1=name1+name2;
        name2=name1.substring(0,name1.length()-name2.length());
        name1=name1.substring(name2.length());
        System.out.println(name1);
        System.out.println(name2);
    }
}