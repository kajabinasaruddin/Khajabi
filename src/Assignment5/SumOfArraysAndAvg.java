package Assignment5;
import java.util.Scanner;
public class SumOfArraysAndAvg
{
    public static int calculate(int[] array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];}
        return sum;}
    public static float avg(int[] array){
        int sum = calculate(array); // Calling sum method
        return (int) sum / array.length;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(calculate(array));
        System.out.println(avg(array));}}
