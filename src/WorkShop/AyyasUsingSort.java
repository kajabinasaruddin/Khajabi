package WorkShop;

import java.util.Arrays;
import java.util.Scanner;

public class AyyasUsingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i] +" ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println();
        System.out.println("maximum element:" +max);
    }
}
