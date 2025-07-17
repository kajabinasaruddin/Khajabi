package ListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(10);
        l1.add(30);
        l1.add(20);
        l1.add(40);
        Collections.sort(l1);
        System.out.println(l1);
        ArrayList<String> l2=new ArrayList<>();
        l2.add("nasirudhhin");
        l2.add("mastanbhi");
        l2.add("khajabi");
        l2.add("hussenbhi");
        l2.add("mastanbhi");
        Collections.sort(l2);
        System.out.println(l2);
    }
}
