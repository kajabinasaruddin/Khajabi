package arrays_Practice_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class REmove_duplicated_values_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        int i=0;
        for(int j=0;j<n;j++){
            if(array[i]!=array[j]){
                i++;
                array[i]=array[j];
            }
        }
        System.out.println(i+1);
        for(int k=0;k<=i;k++){
            System.out.println(array[k]+" ");
        }
    }
}
