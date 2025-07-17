package Assignment5;
import java.util.Arrays;
public class CheckAnagram {
    public static boolean anagrams(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
       char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        if(anagrams(s1,s2)){
            System.out.println("angrams");
        }
        else{
            System.out.println("not anagrams");
        }
    }
}
