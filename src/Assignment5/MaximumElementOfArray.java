package Assignment5;
import java.util.Scanner;
public class MaximumElementOfArray {
    public int Array(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbers:");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        MaximumElementOfArray obj = new MaximumElementOfArray();
        int max = obj.Array(array);
        System.out.println(max);
    }
}