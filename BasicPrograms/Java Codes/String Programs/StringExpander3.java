public class StringExpander3
{
    public static void main(String[] args) 
    {
        String input = "a1b10c3";
        StringBuilder output = new StringBuilder(); 
        for(int i = 0; i < input.length(); i++)   // Loop through the string
        {
            if (Character.isLetter(input.charAt(i))) // When we find a letter, it's the character we need to repeat
            {
                char ch = input.charAt(i); // Get the character
                int count = 0; // Initialize the count for repetitions
                i++; // Move to the next character, which should be a number
                while (i < input.length() && Character.isDigit(input.charAt(i))) // While we're still inside the string and the character is a digit
                {
                    count = count * 10 + (input.charAt(i) - '0'); // While we're still inside the string and the character is a digit
                    i++; // For example, if the number is "10", first 'count' becomes 1, then 10
                }
                
                // Now we have the letter and the full count (repetitions)
                // Append the character 'count' number of times
                for (int j = 0; j < count; j++)
                {
                    output.append(ch); // Append the character to the result
                }
                
                i--; // Decrease 'i' to adjust for the loop's auto-increment (we moved past the number)
            }
        }
        System.out.println(output.toString()); // Output should be "abbbbbbbbbbccc"
    }
}