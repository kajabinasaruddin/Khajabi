package Collection_Problems_practice_Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Convert_hashet_Treeset_using_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1);
        TreeSet<Integer> s2=new TreeSet<>(s1);
        System.out.println(s2);
    }
}
