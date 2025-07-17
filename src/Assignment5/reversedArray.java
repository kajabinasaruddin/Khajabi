package Assignment5;
import java.util.Scanner;
public class reversedArray {
    //1.Create a method that accepts an array and returns a new array with   reversed elements.
    public static void reverseArray(int []array){
        System.out.println("before reverse:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("after reversing :");
        for(int j=array.length-1;j>=0;j--){

            System.out.print(array[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        reverseArray(array);
    }
}
