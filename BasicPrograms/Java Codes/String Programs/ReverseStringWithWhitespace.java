public class ReverseStringWithWhitespace {
    public static void main(String[] args) 
    {
        String input = "Hello World! ";
        
        // Step 1: Convert the input string into a character array
        char[] chars = input.toCharArray();
        
        int start = 0;          // Pointer at the beginning of the array
        int end = chars.length - 1; // Pointer at the end of the array

        // Step 2: Two-pointer approach to reverse non-space characters
        while (start < end) 
        {
            // Step 3: Skip spaces from the start
            if (chars[start] == ' ') 
            {
                start++;
            }
            // Step 4: Skip spaces from the end
            else if (chars[end] == ' ') 
            {
                end--;
            }
            // Step 5: Swap characters when both are not spaces
            else 
            {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        // Step 6: Convert the modified character array back to a string
        String result = new String(chars);

        // Step 7: Print the result
        System.out.println(result);  // Output will be " olleH dlroW! "
    }
}
