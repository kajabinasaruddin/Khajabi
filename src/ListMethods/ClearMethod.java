package ListMethods;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("cherry");
        list.add("danger");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
