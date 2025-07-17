package Assignment8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MaximumMinimumElements {
    //Implement a function that returns both the maximum and minimum values from a list of integers.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        System.out.println("maximum:" +Collections.max(arr));
        System.out.println("minimum:" +Collections.min(arr));
    }
}
