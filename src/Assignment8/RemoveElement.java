package Assignment8;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        //1. Implement a method that takes a list of integers and two numbers, x and y.
        // Add x to the list at index 2, then remove the first occurrence
        // of y if it exists. Return the modified list.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int n= sc.nextInt();
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=0;i<n;i++)
            l1.add(sc.nextInt());
        System.out.println("enter:");
        int x=sc.nextInt();
        System.out.println("enter:");
        int y=sc.nextInt();
        l1.add(2,x);
        if(l1.contains(y))
            l1.remove(Integer.valueOf(y));
        System.out.println("enter a list");
        System.out.println(l1);
    }
}
