package ListMethods;

import java.util.ArrayList;

public class ArrayListHomogeneous {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("alice");
        ar.add("bob");
        ar.add("charlie");
        ar.add("alice");
        ar.add(null);
        System.out.println(ar);
    }
}
