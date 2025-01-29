public class Count_Chars 
{
    public static void CountChars_WithoutSpace(String str)
    {
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
        }
        System.out.println("String : " + str);
        System.out.println("Number of Characters without Space: " + count);
    }

    public static void CountChars_WithSpace(String str)
    {
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            count++;
        }
        System.out.println("String : " + str);
        System.out.println("Number of Characters with Space: " + count);
    }

    public static void main(String[] args) 
    {
        String str = "Hello World!";
        CountChars_WithoutSpace(str);
        CountChars_WithSpace(str);
    }
}
