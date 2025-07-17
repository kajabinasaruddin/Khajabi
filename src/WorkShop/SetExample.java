package WorkShop;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(30);
        System.out.println(l1);
        Set s1=new HashSet(l1); //linked thread
        System.out.println(s1);
        Set s2=new LinkedHashSet(l1);//single thread
        System.out.println(s2);
        Set<Integer> s3=new TreeSet<>(l1);//single thread
        System.out.println(s3);
        Set s4=new CopyOnWriteArraySet(l1);//multithread
        System.out.println(s4);
    }
}
