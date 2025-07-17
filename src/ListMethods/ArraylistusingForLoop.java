package ListMethods;

import java.util.ArrayList;

public class ArraylistusingForLoop {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("alice");
        arr.add("bob");
        arr.add("charlie");
        arr.add("don");
        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
