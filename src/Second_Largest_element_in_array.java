import java.util.Arrays;
import java.util.Scanner;
public class Second_Largest_element_in_array {
    public static void main(Project5[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            if(array[i] != array[n-1]){
                System.out.println();
        }
        }
    }
}
