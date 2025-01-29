public class RemoveDupes 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 2, 4, 3, 5};
        int length = arr.length;

        System.out.println("Initial Array length : " + length);
        System.out.print("Initial Array : ");
        for(int i=0; i<length; i++)
        {
            System.out.print(arr[i]);
            if (i < length - 1) 
            {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < length - 1; i++)    // Outer loop to check each element
        {
            for (int j = i + 1; j < length; j++)   // Inner loop to compare with subsequent elements
            {
                if (arr[i] == arr[j]) 
                {
                    for (int k = j; k < length - 1; k++)  // Shift elements left to overwrite duplicate
                    {
                        arr[k] = arr[k + 1];
                    }
                    length--;   // Decrease array size
                    j--;   // Adjust the inner loop index
                }
            }
        }

        System.out.println();
        
        System.out.println("Final Array length : " + length);
        System.out.print("Final Array : ");
        for (int i = 0; i < length; i++) 
        {
            System.out.print(arr[i]);
            if (i < length - 1) 
            {
                System.out.print(", ");
            }
        }
    }
}
