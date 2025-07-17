package arrays_Practice_Problems;
import java.util.Scanner;
public class Common_elements_between_two_arrays_of_integers {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] arrays={4,5,6,7,8};
        int a1=array.length;
        int b1=arrays.length;
        for(int i=0;i<a1;i++){
            for(int j=0;j<b1;j++){
                if(array[i]==arrays[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}