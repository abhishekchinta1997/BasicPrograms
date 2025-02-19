public class FirstNonRepeatingCharacter {
    public static void main(String[] args) 
    {
        String input = "geeksforgeeks";
        
        // Outer loop: Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            // Initialize a variable to count occurrences of the current character
            int count = 0;

            // Inner loop: Compare the current character (input.charAt(i)) with every other character in the string
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count++;  // Increment count if a match is found
                }
            }

            // If the current character appears only once in the entire string (count == 1),
            // it is the first non-repeating character, so print it
            if (count == 1) {
                System.out.println("The first non-repeating character is: " + input.charAt(i));
                return;  // Exit the program once the first non-repeating character is found
            }
        }
        
        // If no non-repeating character is found after iterating through the string
        System.out.println("No non-repeating character found.");
    }
}
