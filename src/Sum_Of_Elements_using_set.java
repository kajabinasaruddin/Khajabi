import java.util.Set;
import java.util.TreeSet;

public class Sum_Of_Elements_using_set {
    public static void main(Project5[] args) {
        Set<Integer> s1=new TreeSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        System.out.println(s1);
        Set<Integer> s2=new TreeSet<>();
        s2.add(30);
        s2.add(40);
        s2.add(50);
        s2.add(60);
        s2.add(10);
        System.out.println(s2);
        //Union
        Set<Integer> s3=new TreeSet<>(s1);
        s3.addAll(s2);
        System.out.println(s3);
        //Intersection
        Set<Integer> s4=new TreeSet<>(s1);
        s4.containsAll(s2);
        System.out.println(s4);

    }
    //Set<Integer>s1=new HashSet<>(Arrays.asList(1,2,3,4));
}
