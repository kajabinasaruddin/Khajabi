package Assignment8;
import java.util.ArrayList;
import java.util.Scanner;
public class ListStrings {
    //2. Given a list of strings, implement a function that checks whether the list contains a given word.
    // If found, return its first index; otherwise, return -1.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter size");
        int n= scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scanner.nextInt());
        }
        System.out.println("Enter x value");
        int x= scanner.nextInt();
        System.out.println("Enter y value");
        int y=scanner.nextInt();
        if(al.contains(y))
            al.remove(Integer.valueOf(y));
        else
            al.add(2,x);
        System.out.println(al);
    }
}
