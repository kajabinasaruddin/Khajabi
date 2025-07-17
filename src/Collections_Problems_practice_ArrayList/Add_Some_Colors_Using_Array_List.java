package Collections_Problems_practice_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class Add_Some_Colors_Using_Array_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n= sc.nextLine();
        List<String> l1=new ArrayList<>();
        for(int i=0;i<n.length();i++){
            l1.add(sc.nextLine());
        }
        System.out.println(l1+"");
    }
}
