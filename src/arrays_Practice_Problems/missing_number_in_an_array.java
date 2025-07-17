package arrays_Practice_Problems;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class missing_number_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        Set<Integer> set = new HashSet<>();

        // Read input and add elements to the set
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            set.add(nums[i]);
        }
        // Check which numbers are missing
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
