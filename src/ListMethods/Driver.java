package ListMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("B");
        al.add("C");
        al.add("A");
        List<String> unmodifiableList=Collections.unmodifiableList(al);
        unmodifiableList.add("D");
        System.out.println(unmodifiableList);
    }
}
