package ListMethods;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    public static void main(String[] args) {
        List l1=new ArrayList();
        List<Integer> l2=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(1);
        l1.add("alice");
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.set(2,55));
        System.out.println(l1);
        System.out.println(l1.remove(1));
        System.out.println(l1);
        System.out.println(l1.size());


    }
}
