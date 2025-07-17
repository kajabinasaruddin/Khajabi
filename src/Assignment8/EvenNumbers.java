package Assignment8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class EvenNumbers {
    //Write a function that removes all even numbers from a given list.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());}
        System.out.println(l1);
        Iterator<Integer> it=l1.iterator();
        while (it.hasNext()){
            if(it.next()%2==0)
                it.remove();}
        System.out.println(l1);
    }
}
