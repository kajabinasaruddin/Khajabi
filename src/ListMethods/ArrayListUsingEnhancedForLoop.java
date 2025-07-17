package ListMethods;

import java.util.ArrayList;

public class ArrayListUsingEnhancedForLoop {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("alice");
        arr.add("bob");
        arr.add("charlie");
        arr.add("don");
        for(String list:arr){
            System.out.println(list);
        }
    }
}
