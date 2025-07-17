package WorkShop;

import java.util.ArrayList;
import java.util.List;

public class Contains {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        List<Integer>l2=new ArrayList<>();
        l2.add(10);
        l2.add(20);
        System.out.println(l1.contains(l2));

        System.out.println(l1.isEmpty());

        List<Integer>l3=new ArrayList<>();
        System.out.println(l3.isEmpty());

    }
}
