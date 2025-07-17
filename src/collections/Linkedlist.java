package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        Collections.reverse(l1);
        System.out.println(l1);
    }
}
