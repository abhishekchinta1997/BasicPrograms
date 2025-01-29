public class RemoveWhiteSpace 
{
    public static void WithRegEx(String str)
    {
        String resultString = str.replaceAll("\\s", "");
        System.out.println("With RegEx");
        System.out.println("Original String: " + str);
        System.out.println("String without white spaces: " + resultString);
    }

    public static void WithoutRegEx(String str)
    {
        StringBuilder resultString  = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                resultString.append(str.charAt(i));
            }
        }
        System.out.println("Without RegEx");
        System.out.println("Original String: " + str);
        System.out.println("String without white spaces: " + resultString);
    }

    public static void main(String[] args) 
    {
        String str = "Hello World, Welcome";
        WithRegEx(str);
        WithoutRegEx(str);
    }
}
