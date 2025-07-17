package setsPractice;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicatedCharacters {
    public static void main(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray();
        Set<Character>set=new LinkedHashSet<>();
        for(char c:ch){
            set.add(c);}
        System.out.println(set);
    }
}