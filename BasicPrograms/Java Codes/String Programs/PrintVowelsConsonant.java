public class PrintVowelsConsonant
{
    public static void main(String[] args) 
    {
        String str = "I am an Automation Tester";
        System.out.println("String" + str);
        str = str.toLowerCase();
        String vowels= "";
        String consonants = "";
        for(int i=0; i<str.length(); i++)
        {
            char currentChar = str.charAt(i);
            if(currentChar == 'a' || 
               currentChar == 'e' || 
               currentChar == 'i' || 
               currentChar == 'o' ||
               currentChar == 'u')
            {
                if(vowels.length() > 0)
                {
                    vowels = vowels + ", ";
                }
                vowels = vowels + currentChar;
            }
            else if(currentChar != ' ')
            {
                if(consonants.length() > 0)
                {
                    consonants = consonants + ", ";
                }
                consonants = consonants + currentChar;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }
}
