package arrays_Practice_Problems;
import java.util.Scanner;
public class Sum_Of_cubic_elements_in_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i< array.length;i++){
            sum+=Math.pow(array[i],3);
        }
        System.out.println(sum);

    }
}
