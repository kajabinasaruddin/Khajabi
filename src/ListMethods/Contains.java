package ListMethods;

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("nasirudhhin");
        arr.add("mastanbi");
        arr.add("khajabi");
        arr.add("hussenbhi");
        arr.add("mastanbi");
        String ele="balu";
        Boolean ar=arr.contains(ele);
        if(ar){
            System.out.println("element exits");
        }
        else{
            System.out.println("element does not exist");
        }
    }
}
