package WorkShop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkeListEnhanceForLoop {
    public static void main(String[] args) {
        List l1=new LinkedList();
        l1.add(10);
        l1.add("20");
        for(Object temp:l1){
            System.out.println(temp);

        }
    }
}
