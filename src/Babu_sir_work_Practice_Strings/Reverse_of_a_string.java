package Babu_sir_work_Practice_Strings;
import java.util.Scanner;
public class Reverse_of_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=name.length()-1;i>=0;i--){
            char ch=name.charAt(i);
            System.out.print(ch);
        }
    }
}