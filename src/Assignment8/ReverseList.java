package Assignment8;
import java.util.ArrayList;
public class ReverseList {
    // Implement a function that reverses the order of elements in a given list of integers
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(70);
        ArrayList<Integer>arr1=new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            arr1.add(arr.get(i));
        }
        System.out.println(arr1);
    }
}
