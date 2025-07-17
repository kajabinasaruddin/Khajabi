package setsPractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubsetOfSets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int n=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.println(s);
        int n1=sc.nextInt();
        Set<Integer>s1=new HashSet<>();
        for(int j=0;j<n1;j++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1);
        if(s.contains(s1)){
            System.out.println("s is the subset of s1");
        }
        else{
            System.out.println("s is not subset of s1");
        }
    }
}
