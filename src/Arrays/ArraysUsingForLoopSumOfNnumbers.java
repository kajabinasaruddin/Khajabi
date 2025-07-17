package Arrays;

import java.util.Scanner;

public class ArraysUsingForLoopSumOfNnumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int array[] = new int[n];
        for(int i=0;i<n;i++)
        {
             array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            sum = sum + array[i];
            System.out.println(sum);
        }
    }
}
