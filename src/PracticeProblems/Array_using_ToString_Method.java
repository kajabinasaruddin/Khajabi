package PracticeProblems;
import java.util.Arrays;
import java.util.Scanner;
public class Array_using_ToString_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        Arrays.toString(array);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]+" ");
        }
    }
}
