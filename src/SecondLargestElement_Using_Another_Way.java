import java.util.Scanner;
public class SecondLargestElement_Using_Another_Way{
    public static void main(Project5[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("Enter numbers (non-number to stop):");
        while (sc.hasNextInt()) { // Read integers until a non-integer input is given
            int num = sc.nextInt();

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);

    }
}
