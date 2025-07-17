package arrays_Practice_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Descending_Order_Using_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
