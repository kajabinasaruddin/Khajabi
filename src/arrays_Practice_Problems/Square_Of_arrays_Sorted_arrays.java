package arrays_Practice_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Square_Of_arrays_Sorted_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int[] result=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(int i=0;i< array.length;i++){
        result[i]=(int)Math.pow(array[i], 2);
        System.out.print(result[i]+" ");}
        System.out.println("");
        Arrays.sort(result);

    }
}
