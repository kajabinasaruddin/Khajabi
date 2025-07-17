package ListMethods;

import java.util.ArrayList;

public class GetIndexMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("cherry");
        list.add("danger");
        int index=1;
        String ele=list.get(index);
        System.out.println(ele);
        System.out.println(list.get(3));
        System.out.println(list.get(2));

    }
}
