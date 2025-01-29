import java.util.Arrays;

public class Palindrome {

    public static void Palindrome_Iterative_Approach(int num)
    {
        int originalNum = num;
        int reverse = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if (originalNum == reverse)  // Check if the original number is equal to the reversed number
        {
            System.out.println(originalNum + " is Palindrome (Iterative)");
        } else {
            System.out.println(originalNum + " is not Palindrome (Iterative)");
        }
    }

    public static void Palindrome_Recursive_Approach(int num, int rev)  
    {  
        if (num == 0)  // Base case: stop recursion when num becomes 0
        {  
            if (rev == num)   // After recursion, check if reverse is equal to original number
                System.out.println(rev + " is Palindrome (Recursive)");  
            else  
                System.out.println(rev + " is not Palindrome (Recursive)");  
            return;  // End recursion
        }  
        
        int rem = num % 10;  // Get the last digit
        rev = rev * 10 + rem;  // Update reverse by appending the last digit
        num = num/10;   // Reduce num by removing the last digit
        
        Palindrome_Recursive_Approach(num, rev);  // Recursive call with the number reduced by one digit
    }   

    public static void main(String[] args) 
    {
        int number = 121;
        Palindrome_Iterative_Approach(number);
        Palindrome_Recursive_Approach(number, 0);

        int[] arr = {12021, 36954, 0, 1};
        System.out.println("Array of Numbers : " + Arrays.toString(arr));
        for(int num : arr)
        {
            Palindrome_Iterative_Approach(num);
            Palindrome_Recursive_Approach(num, 0);
        }
    }
    
}
