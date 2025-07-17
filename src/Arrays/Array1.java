package Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //int a[]={10,20,30,40,50};
        //a[0]=10;
        //a[1]=20;
       // a[2]=30;
       // a[3]=40;
        //a[4]=50;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(sc.hasNextInt()){
            int index=sc.nextInt();
            System.out.println("u are enter the index:" +index);
        }
        else{
            System.out.println("error");
        }
        //System.out.println(n);
       // System.out.println(n[1]);
    }

}
//Write a Java program to create an abstract class Animal with an
// abstract method called sound(). Create subclasses Lion and Tiger
// that extend the Animal class and implement the sound()
// method to make a specific sound for each animal.
