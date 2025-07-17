package Assignment8;
import java.util.ArrayList;
import java.util.Collections;
public class FloatingPointNumbers {
    public static void main(String[] args) {
        //Implement a method that sorts a list of floating-point numbers in descending order.
        ArrayList<Float>l1=new ArrayList<>();
        l1.add(10.0f);
        l1.add(30.0f);
        l1.add(20.0f);
        Collections.sort(l1);
        ArrayList<Float>arr=new ArrayList<>();
        for(int i=l1.size()-1;i>=0;i--){
            arr.add(l1.get(i));
        }
        System.out.println(arr);
    }
}
