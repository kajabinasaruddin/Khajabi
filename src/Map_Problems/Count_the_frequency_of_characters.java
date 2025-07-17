package Map_Problems;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Count_the_frequency_of_characters {
    //Input: "banana"
    //Output: {b=1, a=3, n=2}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(char ch:name.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
