public class ReverseNumber {

    public static void Iterative_Approach(int originalNumber)
    {
        System.out.println("Original Number : "+originalNumber);
        int reversedNumber = 0;
        int count = 0;
        int temp = originalNumber;
        while (temp !=0 ) 
        {
            temp = temp / 10;
            count++;
        }

        for(int i=0; i<count; i++)
        {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber = originalNumber/10;
        }
        System.out.println("Reverse Number Iterative Approach : "+reversedNumber);
    }
    public static void main(String[] args) 
    {
        int number = 258;
        Iterative_Approach(number);    
    }
}
