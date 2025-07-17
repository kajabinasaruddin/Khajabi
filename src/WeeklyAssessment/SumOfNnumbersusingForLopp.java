package WeeklyAssessment;

import java.util.Scanner;

public class SumOfNnumbersusingForLopp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<5;i++){

            int num=sc.nextInt();
            sum=sum+num;
            System.out.println(sum);

        }
    }
}
