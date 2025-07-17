package Assignment8;
import java.util.ArrayList;
import java.util.Scanner;
public class ListToArrayConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        //Given a list of integers, convert it into an array of integers.
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        Object[] names=arr.toArray();
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
    }
}