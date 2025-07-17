package collections;
import java.util.ArrayList;
public class RemoveDupicated {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        ArrayList<String>uniqueList=new ArrayList<>();
        arr.add("alice");
        arr.add("bob");
        arr.add("alice");
        arr.add("bob");
        arr.add("charlie");
        for(String temp:arr){
            if(!uniqueList.contains(temp)){
                uniqueList.add(temp);
            }
        }
        System.out.println(uniqueList);
    }
}