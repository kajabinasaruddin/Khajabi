package Collection_Problems_practice_Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Empty_hashset_easy_or_not {
    public static void main(String[] args) {
        //Write a Java program to test if a hash set is empty or not.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1.isEmpty());
    }
}