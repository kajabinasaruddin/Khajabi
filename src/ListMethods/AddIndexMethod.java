package ListMethods;

import java.util.ArrayList;
import java.util.List;

public class AddIndexMethod {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("cherry");
        list.add(2,"danger");
        list.add(3,"ear");
        System.out.println(list);
    }
}
