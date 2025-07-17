package Assignment8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Sublist {
    public static void main(String[] args) {
        // Given a list of N elements, divide it into two equal sublists (or nearly equal if N is odd).
         Scanner scanner= new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            al.add(scanner.nextInt());
        }
        List<Integer> sublist1 = new ArrayList<>();
        List<Integer> sublist2 = new ArrayList<>();
        int mid = (size + 1) / 2;
        sublist1.addAll(al.subList(0, mid));
        sublist2.addAll(al.subList(mid, size));
        System.out.println("First sublist: " + sublist1);
        System.out.println("Second sublist: " + sublist2);
    }
}
