package arrays_Practice_Problems;
import java.util.Scanner;
public class Claculate_sum_and_average_using_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("sum of number:" +sum);
        float avg=array.length/sum;
        System.out.println("avg number is:" +avg);
    }

}
