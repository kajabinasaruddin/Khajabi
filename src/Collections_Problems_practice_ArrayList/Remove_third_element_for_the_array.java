package Collections_Problems_practice_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Write a Java program to remove the third element from an array list.
public class Remove_third_element_for_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        l1.remove(4);
        System.out.println(l1);
    }
}
