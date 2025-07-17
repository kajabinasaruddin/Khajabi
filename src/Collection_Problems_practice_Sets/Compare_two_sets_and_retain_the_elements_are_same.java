package Collection_Problems_practice_Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Compare_two_sets_and_retain_the_elements_are_same {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1);
        int n1=sc.nextInt();
        Set<Integer> s2=new HashSet<>();
        for(int j=0;j<n1;j++){
            s1.add(sc.nextInt());
        }
        System.out.println(s2);
        System.out.println(s1==s2);

    }
}
