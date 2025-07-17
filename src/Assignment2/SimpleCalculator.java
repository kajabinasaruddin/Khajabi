package Assignment2;

import java.util.Scanner;

public class SimpleCalculator {
    /* Implement a basic calculator that takes two numbers and an operator
     (+, -, *, /) as input, and uses if-else statements to perform the corresponding operation.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("enter an operator(+, -,*,/):");
        char operator=sc.next().charAt(0);
        int result;
        if(operator == '+'){
            result = num1+num2;
            System.out.println(result);
        }
        else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            // Check for division by zero
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            // Handle invalid operator input
            System.out.println("Invalid operator! Please enter +, -, *, or /.");
}
    }
}
