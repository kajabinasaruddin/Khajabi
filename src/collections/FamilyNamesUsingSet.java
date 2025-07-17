package collections;

import java.util.*;

public class FamilyNamesUsingSet {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("khajbai");
        arr.add("hussenbhi");
        arr.add("nasiruddin");
        arr.add("mastanbi");
        Set<String>l1=new TreeSet<String>(arr);
        System.out.println(l1);

    }

}
