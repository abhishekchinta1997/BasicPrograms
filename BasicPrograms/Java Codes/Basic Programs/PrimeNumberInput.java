import java.util.Scanner;

public class PrimeNumberInput 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) 
        {
            isPrime = false;
        }
        else
        {
            // Check for factors from 2 to the square root of the number
            for (int i = 2; i<=number/2; i++) 
            {
                if (number % i == 0)
                 {
                    isPrime = false; // Found a factor, so the number is not prime
                    break;
                }
            }
        }

        // Output the result
        if (isPrime)
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner object
        scanner.close();
    }

}
