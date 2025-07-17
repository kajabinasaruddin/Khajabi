package Collections_Problems_practice_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a Java program to copy one array list into another.
public class Copy_the_data_One_List_to_Another_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int n1=sc.nextInt();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<n1;i++){
            l2.add(sc.nextInt());
        }
        System.out.println(l1.addAll(l2));
        System.out.println(l1);

    }
}
