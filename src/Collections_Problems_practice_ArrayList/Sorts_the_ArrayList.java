package Collections_Problems_practice_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//Write a Java program to update an array element by the given element.
public class Sorts_the_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Collections.sort(l1);
        System.out.println(l1);
    }
}
