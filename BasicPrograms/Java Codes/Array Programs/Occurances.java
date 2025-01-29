import java.util.Arrays;

public class Occurances {
    public static void main(String[] args) 
    {
        int[] arr = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};  // Initialize array
        int[] occurances = new int[arr.length];   // Array occurances will store occurance of each element
        int visited = -1;   // Variable to mark visited elements
        for (int i = 0; i < arr.length; i++) // Traverse through the array to count occurances
        {  
            int count = 1;  
            for (int j = i + 1; j < arr.length; j++)  // Compare the current element with remaining elements
            {  
                if (arr[i] == arr[j]) 
                {  
                    count++;  // To avoid counting the same element again
                    occurances[j] = visited;  
                }  
            }
            if (occurances[i] != visited)   // Store the frequency if the element is not visited
            {
                occurances[i] = count;
            }
        }  

        // Display the frequency of each element in the array
        System.out.println("---------------------------------------");  
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("---------------------------------------");  
        System.out.println(" Element    |    Occurance ");  
        System.out.println("---------------------------------------");  
        
        for (int i = 0; i < occurances.length; i++) 
        {  
            if (occurances[i] != visited)  
            {
                String str;
                if(occurances[i] > 1)
                {
                    str = "times";
                }
                else
                {
                    str = "time";
                }
                System.out.println(arr[i] + " appeared" + "  |  " + occurances[i] + " " + str);  
            }  
        } 
        System.out.println("----------------------------------------");  
    }
}
