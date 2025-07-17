package Assignment2;

import java.util.Scanner;

public class SimpleAlaram {
    /*  Design a program that sets an alarm based on the time of day.
        The user inputs a time, and the program informs if it's time
        for breakfast, lunch, or dinner (e.g., breakfast before 10 AM,
        lunch between 12 PM and 2 PM, dinner after 7 PM).
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a time:");
        int time=sc.nextInt();
        if(time <= 10){
            System.out.println("breakfast");
        }
        else if(time <= 12 && time >= 14){
            System.out.println("lunch");
        }
        else if(time <= 19){
            System.out.println("dinner");
        }
        else{
            System.out.println("this is not meals time");
        }
    }
}
