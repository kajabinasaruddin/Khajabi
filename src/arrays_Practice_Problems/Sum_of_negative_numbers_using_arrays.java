package arrays_Practice_Problems;
import java.util.Scanner;
public class Sum_of_negative_numbers_using_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            if(array[i]<0){
                System.out.println(array[i]);
                sum=sum+array[i];
            }
        }
        System.out.println(sum);
    }
}
