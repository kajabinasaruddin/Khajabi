package arrays_Practice_Problems;
import java.util.Scanner;
public class Array_element_to_print_cubic_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            int result=(int)Math.pow(array[i],3);
            //int result=(array[i*array[i]*array[i]
            System.out.print(result+" ");
        }

    }
}
