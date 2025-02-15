public class ChangeCase 
{
    public static void main(String[] args) 
    {
        String str1="Great Power";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) 
        {    
            if(Character.isLowerCase(str1.charAt(i)))   //Checks for lower case character 
            {     
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    //Convert it into upper case using toUpperCase() function   
            }    
            else if(Character.isUpperCase(str1.charAt(i)))   //Checks for upper case character   
            {    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));   //Convert it into upper case using toLowerCase() function  
            }    
        }    
        System.out.println("Original String : " + str1);
        System.out.println("String after case conversion : " + newStr);   
    }
}
