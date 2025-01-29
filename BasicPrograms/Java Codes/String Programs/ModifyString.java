public class ModifyString {
    public static void main(String[] args) {
        String input = "abhishek";
        StringBuilder output = new StringBuilder();
        for(int i=0; i<input.length(); i++)
        {
            output.append(input.charAt(i));
            if(i != input.length()-1)   // Append '-' after each character except the last one
            {
                output.append('-');
            }
        }
        System.out.println(output.toString());

        // another method
        System.out.println(String.join("-", "chinta".split("")));
    }
}
