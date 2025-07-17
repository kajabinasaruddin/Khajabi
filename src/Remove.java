import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 public class Remove {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Set<String> s=new HashSet<>();
        for(int i=0;i<n.length();i++){
            s.add(sc.nextLine());
        }
        System.out.println(s);
    }
}
