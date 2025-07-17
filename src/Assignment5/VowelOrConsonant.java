package Assignment5;
import java.util.Scanner;
public class VowelOrConsonant {
    public static String characters(char ch){
        ch= Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o'|| ch == 'u' ){
            return "vowels";
        }
        else if (ch >='a' && ch<='z'){
            return "consonant";
        }
        else{
            return "invalid";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(characters(ch));
    }
}
