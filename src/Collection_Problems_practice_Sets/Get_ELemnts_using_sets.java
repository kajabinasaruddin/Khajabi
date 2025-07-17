package Collection_Problems_practice_Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Write a Java program to get the number of elements in a hash set.
public class Get_ELemnts_using_sets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1.size());
    }
}
