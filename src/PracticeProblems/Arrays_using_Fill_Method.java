package PracticeProblems;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_using_Fill_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.fill(array,100);
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
