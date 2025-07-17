package arrays_Practice_Problems;
import java.util.Scanner;
public class Sum_of_array_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
