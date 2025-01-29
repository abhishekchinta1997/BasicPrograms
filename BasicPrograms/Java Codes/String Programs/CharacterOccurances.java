public class CharacterOccurances {
    public static void main(String[] args) 
    {
        String str = "grass is greener on the other side";  // Input string
        System.out.println("Original String : " + str);  
        char[] stringArray = str.toCharArray();  // Convert string to character array
        for (int i = 0; i < stringArray.length; i++) // Loop through each character in the string
        {
            char c = stringArray[i];   // Get the current character
            if (c != ' ' && c != '0') // Skip spaces or any other character you don't want to count
            {
                int count = 1;  // Initialize count to 1 because we've found this character once
                for (int j = i + 1; j < stringArray.length; j++) // Compare with the remaining characters
                {
                    if (c == stringArray[j]) 
                    {
                        count++;  // Increment count if the character matches
                        stringArray[j] = '0';  // Mark the character as counted by setting it to '0'
                    }
                }

                String times;
                if (c != '0') // Print the character and its count
                {
                    if(count > 1)
                    {
                        times = "times";
                    }
                    else
                    {
                        times = "time";
                    }
                    System.out.println(c + " appeared " + count + " " + times);
                }
            }
        }
    }
}
