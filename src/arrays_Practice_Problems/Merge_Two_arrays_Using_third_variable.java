package arrays_Practice_Problems;
import java.util.Arrays;
public class Merge_Two_arrays_Using_third_variable {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] arrays={6,7,8,9,10};
        int a1=array.length;
        int b1= array.length;
        int c1=a1+b1;
        int[] c=new int[c1];
        for(int i=0;i<a1;i++){
            c[i]=array[i];
        }
        for(int i=0;i<b1;i++){
            c[a1+i]=arrays[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
