import java.util.Set;
import java.util.TreeSet;
public class TreeSet_Example {
    public static void main(String[] args) {
        Set<Integer>s1=new TreeSet<>();
        s1.add(null);
        s1.add(null);
        s1.add(10);
        System.out.println(s1);
    }
}
