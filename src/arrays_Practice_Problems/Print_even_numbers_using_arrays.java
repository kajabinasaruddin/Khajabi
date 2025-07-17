package arrays_Practice_Problems;
import java.util.Scanner;
public class Print_even_numbers_using_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        for(int i=0;i< array.length;i++){
            if(array[i]%2 == 0){
                System.out.print(array[i]+" ");
            }
        }
    }
}
