public class DivideStringEqual 
{

    public static void DivideStrEqual(String str, int numberOfEqualParts) {
        // Check if the string can be divided into equal parts
        if (numberOfEqualParts <= 0) 
        {
            System.out.println("Invalid number of parts. It should be greater than 0.");
            return;
        }

        if (str.length() % numberOfEqualParts != 0)
        {
            System.out.println("Sorry this string (" + str + ") cannot be divided into " + numberOfEqualParts + " equal parts.");
        }
        else
        {
            int partLength = str.length() / numberOfEqualParts;
            String[] equalStr = new String[numberOfEqualParts];

            // Divide string into equal parts
            for (int i = 0; i < numberOfEqualParts; i++) 
            {
                equalStr[i] = str.substring(i * partLength, (i + 1) * partLength);
            }

            System.out.println("Original String : " + str);
            System.out.println(numberOfEqualParts + " equal parts of the given string are: ");
            for (String part : equalStr)
            {
                System.out.println(part);
            }
        }
    }

    public static void main(String[] args) {
        String[] strArrays = {"aaabbbccc", "asdfwetjbo", "abcdefgh"};
        int numberOfEqualParts = 3;  
        for (String str : strArrays) {
            DivideStrEqual(str, numberOfEqualParts);
        }
    }
}
