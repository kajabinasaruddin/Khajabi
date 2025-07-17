package Assignment8;
import java.util.ArrayList;
import java.util.Scanner;
public class ComparesTwoLists {
    //Write a function that compares two lists of strings and returns true if they are equal.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr1=new ArrayList<>();
        System.out.println("Enter " + n + " strings:");
        for(int i=0;i<n;i++){
            arr1.add(sc.nextLine());
        }
        System.out.println(arr1);
        int n1=sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr2=new ArrayList<>();
        System.out.println("Enter " + n1 + " strings:");
        for(int j=0;j<n1;j++){
            arr2.add(sc.nextLine());
        }
        System.out.println(arr2);
        System.out.println(arr1.contains(arr2));
    }
}
