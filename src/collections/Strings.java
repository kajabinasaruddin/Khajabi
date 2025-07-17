package collections;
import java.util.ArrayList;
public class Strings {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("bob");
        int count=0;
        for(int i=0;i< arr.size();i++){
            String s=arr.get(i).toLowerCase();
            for(int j=0;j<s.length();j++) {
                char f=s.charAt(j);
                if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u' ) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}