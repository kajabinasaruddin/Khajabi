package ListMethods;

import java.util.ArrayList;
import java.util.List;
public class sizeMethod {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("cherry");
        System.out.println(list);
        System.out.println(list.size());
    }
}
