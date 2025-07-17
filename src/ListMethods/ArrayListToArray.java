package ListMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        //this is dynamic in nature
        List<String> names=new ArrayList<>();
        names.add("alice");
        names.add("bob");
        //change it to array
        Object[] names1=names.toArray();
        for(Object temp:names1){
            System.out.println(temp);
        }
    }
}
