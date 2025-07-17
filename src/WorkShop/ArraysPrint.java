package WorkShop;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<=array.length-1;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        //toString :  Arrays.toString(array) converts the array into a formatted string (e.g., [1, 2, 3, 4]).
    }
}
