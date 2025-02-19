public class RemoveDuplicatesString 
{
    public static void main(String[] args) 
    {
        String str = "programming";
        System.out.println("String : " +  str);
        
        char[] strArray = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strArray.length; i++)
        {
            boolean isDupe = false;
            for(int j=0; j<sb.length(); j++)
            {
                if(strArray[i] == sb.charAt(j))
                {
                    isDupe = true;
                    break;
                }
            }
            if(!isDupe)
            {
                sb.append(strArray[i]);
            }
        }
        System.out.println(sb.toString());
    }
}




// import java.util.ArrayList;

// class Main {
//     public static void main(String[] args) {
//         String str = "programming";
//         System.out.println("String : " +  str);
        
//         char[] strArray = str.toCharArray();
//         ArrayList<String> al = new ArrayList<>();
//         for(int i=0; i<strArray.length; i++)
//         {
//             String ch = Character.toString(strArray[i]);
//             if(!al.contains(ch))
//             {
//                 al.add(ch);
//             }
//         }
//         System.out.println(al.toString());
//     }
// }