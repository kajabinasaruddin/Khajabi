package Java_8_features_and_predefined_methods;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting_arrays {
    @FunctionalInterface
    interface Sorted{
        void sort(int n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sorted s= (int n) ->{
            Integer[] array=new Integer[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            Arrays.sort(array);
            for(int i=0;i< array.length;i++){
                System.out.print(array[i]+" ");
            }
        };
        int n=sc.nextInt();
        s.sort(n);
    }
}
