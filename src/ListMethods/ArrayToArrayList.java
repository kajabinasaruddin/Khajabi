package ListMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] names={"B","A","C"};
        //convert Array to ArrayList
        List<String> list=new ArrayList<>();
        for(String temp:names){
            list.add(temp);
        }
        System.out.println(list);
    }
}
