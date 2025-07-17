/* package Assignment4;
import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        int count =0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            count=0;
            while(i<str.length() && ch==str.charAt(i) ){
                count++;
                i++;
            }
            i--;
            s=s+ch+count;
        }
        System.out.println(s);}

}
*/