package Collections_Problems_practice_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a Java program to search for an element in an array list.
public class Search_Element_In_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        if(l1.contains(5)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
