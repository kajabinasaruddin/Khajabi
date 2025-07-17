package arrays_Practice_Problems;
import java.util.Scanner;
public class Maximun_minimum_element_in_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        int min=array[0];
        int max=array[0];
        for(int i=1;i<n;i++){
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
