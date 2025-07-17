package arrays_Practice_Problems;
import java.util.Scanner;

public class Insert_an_element_at_first_Position_Using_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("sum of numbers:" +sum);
    }
}
