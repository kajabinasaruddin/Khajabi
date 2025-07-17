package arrays_Practice_Problems;
import java.util.Scanner;
public class Copy_elements_one_array_to_another_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int[] array1=new int[array.length];
        for(int i=0;i< array1.length;i++){
            array1[i]=array[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(array1[i]+" ");
        }
    }
}
