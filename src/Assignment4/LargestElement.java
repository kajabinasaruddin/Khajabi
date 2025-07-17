package Assignment4;
import java.util.Scanner;
public class LargestElement {
    //Find the Largest Element: Implement a program that finds the largest number in an array of integers using a loop.
    public static void main(String[] args) {
        int arr[] = {1, 6, 8, 9, 10};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}