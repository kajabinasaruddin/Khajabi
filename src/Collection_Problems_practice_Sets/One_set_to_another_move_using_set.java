package Collection_Problems_practice_Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Write a Java program to clone a hash set to another hash set.
public class One_set_to_another_move_using_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        Set<Integer> s2=new HashSet<>(s1);
        System.out.println(s1);
    }
}
