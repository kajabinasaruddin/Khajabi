package Collections_Problems_practice_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a Java program to insert an element into the array list at the first position.
public class Add_Element_At_First_Position_Using_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println(l1);
        l1.add(0,10);
        System.out.println(l1);
    }
}
