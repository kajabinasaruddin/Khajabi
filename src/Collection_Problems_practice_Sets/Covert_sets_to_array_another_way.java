package Collection_Problems_practice_Sets;

import java.util.*;

public class Covert_sets_to_array_another_way {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        System.out.println(s1);
        List<Integer> l1=new ArrayList<>(s1);
        for(int temp:l1){
            System.out.print(temp+" ");
        }
    }
}
