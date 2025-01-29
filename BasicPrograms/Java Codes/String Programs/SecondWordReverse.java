import java.util.Scanner;

public class SecondWordReverse 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to take user input
        System.out.print("Enter a string: ");    // Prompt the user for a string
        String input = scanner.nextLine();  // ABCD DCBA

        String[] words = input.split(" ");
        String firstWord = words[0];
        String secondWord = words[1];
        String revSecondWord = "";
        for(int i=secondWord.length()-1; i>=0; i--)
        {
            revSecondWord = revSecondWord + secondWord.charAt(i);
        }

        System.out.println(firstWord + " " +revSecondWord);

        // Close the scanner
        scanner.close();
    }
}
