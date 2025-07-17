package arrays_Practice_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Second_Smmalest_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
           array[i]=sc.nextInt();
            System.out.print(array[i]+" ");}
        System.out.println("");
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");}
        System.out.println("");
        System.out.println(array[1]);
    }
}
