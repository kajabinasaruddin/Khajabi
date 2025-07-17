package Assignement3;
import java.util.Arrays;
import java.util.Scanner;
public class InstanceVariable {
    // Write a instance method to print the given array in sorted order
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={3,7,9,3,1,4};
        Arrays.sort(arr);
       // int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
