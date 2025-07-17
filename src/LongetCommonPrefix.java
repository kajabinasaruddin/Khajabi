import java.util.Arrays;
import java.util.Scanner;

public class LongetCommonPrefix {
    /*
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
     */
    public String longestprefix(String[] name){
        Arrays.sort(name);
        String first =name[0];
        String last=name[name.length-1];
        for(int i=0;i<first.length() && i<last.length();i++){
            if(first.charAt(i)== last.charAt(i)){
                System.out.print(first.charAt(i));
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] name=new String[3];
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }
        LongetCommonPrefix obj=new LongetCommonPrefix();
        System.out.println(obj.longestprefix(name));
    }
}
