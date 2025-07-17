package Collection_Problems_practice_Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_All_Elements_from_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        s.clear();
        System.out.println(s);
    }
}
