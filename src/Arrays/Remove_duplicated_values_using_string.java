package Arrays;
import java.util.*;
public class Remove_duplicated_values_using_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int name=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<name;i++){
            String[] words=sc.nextLine().split(" ");
            Set<String> s=new LinkedHashSet<>();
            for(String word:words){
                s.add(word);
            }
            System.out.println(String.join(" ",s));
        }

    }
}
