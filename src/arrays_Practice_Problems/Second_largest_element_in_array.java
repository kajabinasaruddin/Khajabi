package arrays_Practice_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
           array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }

}
