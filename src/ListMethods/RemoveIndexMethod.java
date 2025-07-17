package ListMethods;

import java.util.ArrayList;

public class RemoveIndexMethod {
     public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("cherry");
        list.add("danger");
        int index=1;
        list.remove(index);
        System.out.println(list);
       // System.out.println(list.remove(3));
         // System.out.println(list);
    }
}
