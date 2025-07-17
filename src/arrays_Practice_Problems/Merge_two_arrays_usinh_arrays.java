package arrays_Practice_Problems;

import java.util.Scanner;

public class Merge_two_arrays_usinh_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the arrays
        System.out.print("Enter the number of elements for each array: ");
        int n = sc.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        // Reading elements of first array
        System.out.println("Enter " + n + " elements for the first array:");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter " + n + " elements for the second array:");
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }
        int[] mergedArray = new int[2 * n];

        for (int i = 0; i < n; i++) {
            mergedArray[i] = array1[i];        // Copy first array
            mergedArray[i + n] = array2[i];    // Copy second array
        }
        System.out.print("Merged Array: { ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println("}");

        sc.close();
    }
}
