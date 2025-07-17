package Assignment8;
import java.util.ArrayList;
import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        //Write a function that takes a list of words and replaces every occurrence of "bad" with "good".
        ArrayList<String> arr=new ArrayList<>();
        arr.add("this");
        arr.add("isbad");
        arr.add("bad");
        arr.add("good");
        for(int i=0;i< arr.size();i++){
            if(arr.get(i).contains("bad")){
                arr.set(i,"good");
            }
        }
        System.out.println(arr);
    }
}
