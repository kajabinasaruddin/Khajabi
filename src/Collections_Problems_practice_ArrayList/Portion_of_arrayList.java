package Collections_Problems_practice_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a Java program to extract a portion of an array list.
public class Portion_of_arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1.subList(1,5));
    }
}
