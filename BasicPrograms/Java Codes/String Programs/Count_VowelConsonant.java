public class Count_VowelConsonant 
{
    public static void Count_Chars(String str)
    {
        System.out.println("String : " + str);
        int vowelCount = 0; int consonantCount = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || 
                str.charAt(i) == 'e' || 
                str.charAt(i) == 'i' || 
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u')
            {
                vowelCount++;
            }
            else
            {
                consonantCount++;
            }
        }
        System.out.println("Vowel Count : " + vowelCount);
        System.out.println("Consonant Count : " + consonantCount);
    }

    public static void main(String[] args) 
    {
        String str = "Hello World!";
        Count_Chars(str);
    }
}
