package PracticeProblems;
import java.util.Scanner;
public class Bubble_Sort_using_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i]+" ");
        }
    }
}
