package Assignment2;

import java.util.Scanner;

public class CurrencyConverter {
    /* Create a simple program that converts currency from
    USD to another currency based on a fixed conversion
    rate and uses if-else to check if the amount is valid.
     */
    public static void main(String[] args) {
        // Define fixed conversion rate (1 USD to INR)
        final double USD_TO_INR = 83.0;  // Example rate (can be updated)

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter amount in USD: ");
        double usd =scanner.nextDouble();

        // Check if the amount is valid (positive number)
        if (usd > 0) {
            // Convert USD to INR
            double inr = usd * USD_TO_INR;
            System.out.println(usd + " USD is equivalent to " + inr + " INR.");
        } else {
            // Handle invalid input
            System.out.println("Invalid amount! Please enter a positive value.");}
}
}