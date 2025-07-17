package collections;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
public class AscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        Set<Integer>s1=new TreeSet<>(arr);
        System.out.println(s1);
    }
}
