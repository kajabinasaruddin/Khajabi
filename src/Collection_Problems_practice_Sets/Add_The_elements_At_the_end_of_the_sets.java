package Collection_Problems_practice_Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Write a Java program to append the specified element to the end of a hash set.
public class Add_The_elements_At_the_end_of_the_sets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1);
        HashSet<Integer> s2=new HashSet<>(s1);
        s2.add(70);
        System.out.println(s2);
    }
}
