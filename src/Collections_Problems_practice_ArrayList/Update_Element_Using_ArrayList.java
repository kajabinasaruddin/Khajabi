package Collections_Problems_practice_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Update_Element_Using_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        l1.set(1,20);
        System.out.println(l1);
    }
}
