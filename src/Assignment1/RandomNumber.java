package Assignment1;

import java.util.Random;

public class RandomNumber
{
    public static void main(String[] args)
    {

                // Create an instance of the Random class
                Random random = new Random();

                // Generate a random number between 0 to 99 and so adding 1 shifts the range 1 to 100
                int randomNumber = random.nextInt(100) + 1;

                // Print the random number
                System.out.println("Generated Random Number: " + randomNumber);
        }
}
