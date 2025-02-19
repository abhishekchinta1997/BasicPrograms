public class StringExpander4
{
    public static void main(String[] args) 
    {
        String input = "a1b10c3";
        StringBuilder output = new StringBuilder(); 
        
        for(int i=0; i<input.length(); i++)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                char ch = input.charAt(i);   // Get the character
                i++;   // Move to the next character, which should be a number

                StringBuilder numStr = new StringBuilder();   // Extract the number part as a substring
                while (i<input.length() && Character.isDigit(input.charAt(i)))
                {
                    numStr.append(input.charAt(i));   // Build the number string
                    i++;
                }
                int count = Integer.parseInt(numStr.toString());   // Convert the number string to an integer

                for(int j=0; j<count; j++)
                {
                    output.append(ch);   // Append the character 'count' number of times
                }
                i--;   // Decrease 'i' to adjust for the loop's auto-increment (we moved past the number)
            }
        }
        System.out.println(output.toString());  // Output the expanded string
    }
}