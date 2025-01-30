import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to take user input
        System.out.print("Enter a string: ");    // Prompt the user for a string
        String input = scanner.nextLine();

        String revString = "";
        for(int i=input.length()-1; i>=0; i--)
        {
            revString = revString + input.charAt(i);
        }
        if(input.equals(revString))
        {
            System.out.println(input + " is a palindrome");
        }
        else
        {
            System.out.println(input + " is not a palindrome");
        }

        scanner.close();

    }
}
