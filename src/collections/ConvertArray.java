package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConvertArray {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        l1.add(100);
        l1.add(200);
        //l1.toArray();
       // System.out.println(l1);
        ArrayList<Integer>l2=new ArrayList<>(l1);
        System.out.println(l2);

        Vector<Integer> v=new Vector<>(l1);
        System.out.println(v);
        CopyOnWriteArrayList<Integer> cp=new CopyOnWriteArrayList<>(l1);
        System.out.println(cp);
    }
}
