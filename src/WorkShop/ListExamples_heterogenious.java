package WorkShop;

import java.util.ArrayList;
import java.util.List;

public class ListExamples_heterogenious {
    public static void main(String[] args) {
        //heterogenious and homogeneous supports
        //list allows null values
        //list allows duplicated values
        //Quik in retrieval the data or read the data or get the data
        List l1=new ArrayList();
        l1.add(10);
        l1.add(20);
        System.out.println(l1);
        System.out.println(l1.add(6));
        System.out.println(l1);
    }
}
