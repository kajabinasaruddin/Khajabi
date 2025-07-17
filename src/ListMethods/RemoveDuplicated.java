package ListMethods;

import java.util.ArrayList;

public class RemoveDuplicated {
    //how to remove duplicateds from Arraylist?and print unique list?
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String>unique=new ArrayList<>();
        arr.add("alice");
        arr.add("bob");
        arr.add("charlie");
        arr.add("don");
        arr.add("alice");
        arr.add("bob");
        for(String temp:arr){
            if(!unique.contains(temp)){
                unique.add(temp);
            }
        }
        System.out.println(unique);
    }
}
