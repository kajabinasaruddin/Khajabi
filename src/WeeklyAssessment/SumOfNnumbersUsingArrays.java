package WeeklyAssessment;

import java.util.Scanner;

public class SumOfNnumbersUsingArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
            System.out.print(sum + " ");
         }
    }
}
