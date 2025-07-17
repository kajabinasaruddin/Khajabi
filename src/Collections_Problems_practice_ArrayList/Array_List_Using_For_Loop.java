package Collections_Problems_practice_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Write a Java program to iterate through all elements in an array list.
public class Array_List_Using_For_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
    }
}
