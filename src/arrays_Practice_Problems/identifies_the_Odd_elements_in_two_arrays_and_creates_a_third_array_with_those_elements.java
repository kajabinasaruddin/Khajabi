package arrays_Practice_Problems;

import java.util.Arrays;
import java.util.Scanner;

public interface identifies_the_Odd_elements_in_two_arrays_and_creates_a_third_array_with_those_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arrs=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j< arrs.length;j++){
            arrs[j]=sc.nextInt();
        }
        int a1=arr.length;
        int b1=arrs.length;
        int c=a1+b1;
        int[] c1=new int[c];
        for(int i=0;i<a1;i++){
            c1[i]=arr[i];
        }
        for(int i=0;i<b1;i++){
            c1[a1+i]=arrs[i];
        }
        System.out.println(Arrays.toString(c1));
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i] % 2!=0){
                System.out.println(c1[i]);}
        }
    }
}
