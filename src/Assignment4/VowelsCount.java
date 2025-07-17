package Assignment4;
import java.util.Scanner;
public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            str=str.toUpperCase();
            char ch=str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch=='I' || ch == 'O' || ch=='U'){
                c++;
            }
        }
        System.out.println(c);
    }
}
