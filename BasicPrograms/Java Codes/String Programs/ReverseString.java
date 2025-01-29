public class ReverseString
{
    public static void main(String[] args)
    {
        String originalString = "My name is Abhishek Chinta";
        System.out.println("Original String : " + originalString);
        
        String[] words = originalString.split(" ");
        String rearrangedString = words[3] + " " + words[4] + " " + words[2] + " " + words[0] + " " + words[1];
        System.out.println("After Re-arranging words : " + rearrangedString);

        String reversedString = "";
        for(int i=rearrangedString.length()-1; i>=0; i--)
        {
            reversedString = reversedString + rearrangedString.charAt(i);
        }
        System.out.println("Reversed String : " + reversedString);
    }    
}
