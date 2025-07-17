package Collection_Problems_practice_Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Compare_two_sets_using_sets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++) {
            s.add(sc.nextInt());
        }
        int n1=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n1;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s.equals(s1));
    }
}
