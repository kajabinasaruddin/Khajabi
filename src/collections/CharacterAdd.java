package collections;
import java.util.ArrayList;
public class CharacterAdd {
    public static void main(String[] args) {
    ArrayList<Character> l1=new ArrayList<>();
    l1.add('a');
    l1.add('b');
    l1.add('c');
    l1.add('d');
    l1.add('z');
    if(l1.contains('z')){
        l1.remove(0);
    }
    else{
        l1.add('z');
    }
        System.out.println(l1);
}}