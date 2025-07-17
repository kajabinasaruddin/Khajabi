package Map_Example_in_Class;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Example1 {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"alice");
        m1.put(2,"null");
        m1.put(3,"null");
        System.out.println(m1);
        System.out.println(m1.get(1));
        System.out.println(m1.values());
        System.out.println(m1.containsValue("alice"));
        for(Map.Entry<Integer,String>entry:m1.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }
    }
}
