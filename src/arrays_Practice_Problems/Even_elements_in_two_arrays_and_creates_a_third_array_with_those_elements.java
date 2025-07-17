package arrays_Practice_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Even_elements_in_two_arrays_and_creates_a_third_array_with_those_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();}
        int n1=sc.nextInt();
        int[] arrays=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();}
        Arrays.asList(array,arrays);
        System.out.println();
    }
}
