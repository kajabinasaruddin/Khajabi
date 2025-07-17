package arrays_Practice_Problems;

import java.util.Scanner;

public class Print_all_odd_numbers_Using_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(array[i]%2 !=0){
                System.out.println(array[i]);
            }
        }
    }
}
