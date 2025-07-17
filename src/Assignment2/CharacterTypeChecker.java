package Assignment2;

import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); //charAt(0) is a method call that retrieves the first character of a String.
        // Read a single character

        // Check character type using if-else
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
    }

}
