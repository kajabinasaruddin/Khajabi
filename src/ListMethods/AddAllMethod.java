package ListMethods;
import java.util.ArrayList;
import java.util.List;
public class AddAllMethod {
    public static void main(String[] args) {
    ArrayList<String> list1=new ArrayList<>();
        list1.add("alice");
        list1.add("bob");
        list1.add("cherry");
        list1.add("danger");
        List<String>list2=new ArrayList<>();
        list2.add("10");
        list2.add("20");
        list2.add("30");
        list2.add("40");
        list1.addAll(list2);
        System.out.println(list1);
        list2.addAll(list1);
        System.out.println(list2);
    }
}
