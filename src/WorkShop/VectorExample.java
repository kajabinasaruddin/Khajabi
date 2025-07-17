package WorkShop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VectorExample {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("alice");
        l1.add(10);
        System.out.println(l1);
        List l2=new CopyOnWriteArrayList();
        l2.add(20);
        l2.add("bob");
        System.out.println(l2);

    }
}
