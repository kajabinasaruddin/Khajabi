package ListMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        //this will create another list another of making the existing one.
        //it is creating another immutable object
        //we have to assign to some other list
        l1=Collections.unmodifiableList(l1);
        l1.add(40);
        System.out.println(l1);
    }
}
