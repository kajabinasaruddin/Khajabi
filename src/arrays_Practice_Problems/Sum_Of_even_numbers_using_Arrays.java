package arrays_Practice_Problems;
import java.util.Scanner;
public class Sum_Of_even_numbers_using_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(array[i]%2 ==0){
               sum=sum+array[i];
            }
        }
        System.out.println(sum);
    }
}
