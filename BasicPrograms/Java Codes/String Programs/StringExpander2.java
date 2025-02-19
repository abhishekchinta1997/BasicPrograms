public class StringExpander2
{
    public static void main(String[] args) 
    {
        String input = "a1b2c3"; // Input string
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length(); i=i+2)   // Iterate through the input string in steps of 2
        {
            int count = Character.getNumericValue(input.charAt(i+1));  // Extract the number and the character
            char ch = input.charAt(i);
            for (int j = 0; j < count; j++)    // Append the character 'count' times to the output
            {
                output.append(ch);
            }
        }
        System.out.println(output.toString());   // Print the result
    }
}