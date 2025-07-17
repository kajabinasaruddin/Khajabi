package arrays_Practice_Problems;
import java.util.Scanner;
public class Search_the_elements_for_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=3;
        int index=3;
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<pos;i++){
           array[i]=array[index];
        }
        System.out.println(array[index]);

    }
}
