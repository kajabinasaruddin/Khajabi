package WorkShop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String n1="VJ";
        char[] ch=n1.toCharArray();
        String n2="JV";
        char[] ch1=n2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
