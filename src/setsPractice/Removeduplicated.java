package setsPractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Removeduplicated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int n=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.println(s);
    }
}
