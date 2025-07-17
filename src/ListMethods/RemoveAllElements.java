package ListMethods;

import java.util.ArrayList;

public class RemoveAllElements {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("alice");
        arr.add("bob");
        arr.add("charlie");
        arr.clear();
        System.out.println(arr);
    }
}
