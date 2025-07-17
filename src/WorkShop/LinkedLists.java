package WorkShop;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedLists {
    public static void main(String[] args) {
        //heterogenious and homogeneous supports
        //list allows null values
        //list allows duplicated values
        //Quik in retrieval the data or read the data or get the data
        //quick in insertion and deletion of the data
        List<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(60);
        l1.add(30);
        System.out.println(l1);
        List<Integer> l2=new ArrayList<>();
        l2.add(10);
        l2.add(60);
        l2.add(30);
        System.out.println(l2);
        List<Integer> l3=new Vector<>();
        l3.add(10);
        l3.add(60);
        l3.add(30);
        System.out.println(l3);
        List<Integer> l4=new CopyOnWriteArrayList<>();
        l4.add(10);
        l4.add(60);
        l4.add(30);
        System.out.println(l4);

    }
}
