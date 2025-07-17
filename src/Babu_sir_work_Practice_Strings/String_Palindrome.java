package Babu_sir_work_Practice_Strings;
import java.util.Scanner;
public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}