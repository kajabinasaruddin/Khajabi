import java.util.ArrayList;
import java.util.List;
public class Sum_Of_Elements_using_List {
    public static void main(Project5[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(30);
        l1.add(40);
        int sum=0;
        for(int temp:l1){
            sum=sum+ temp;
        }
        System.out.println(sum);
    }
}
