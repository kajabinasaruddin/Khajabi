package Collection_Problems_practice_Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Write a Java program to iterate through all elements in a hash list.
public class Iterate_the_elements_using_sets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=1;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1);
    }
}
