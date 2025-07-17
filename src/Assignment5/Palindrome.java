package Assignment5;
import java.util.Scanner;
public class Palindrome {
    public static boolean ispalindrome(String s1, String s2) {
        for(int i= s1.length()-1; i>=0; i++) {
            s1 = s2+s1.charAt(0);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equals(s2)) {
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrom");
        }
    }
}