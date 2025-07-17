package StringMethods;

import java.util.Scanner;
public class CompareTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first string:");
        String name=sc.nextLine();
        System.out.println("enter a second number:");
        String name1=sc.nextLine();
        int result=name.compareTo(name1);
        if(result >0){
            System.out.println("positive");
        }
        else if(result <0 ){
            System.out.println("negetive");
        }
        else{
            System.out.println("zero");
        }
    }
}
