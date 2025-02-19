public class FindPairWithSum
{
    public static void main(String[] args) 
    {
        int[] a = {6, 8, 11, 6, 7, 18};
        int result = 17;
        
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] + a[j] == result) 
                {
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Elements: " + a[i] + " + " + a[j] + " = " + result);
                    return; // exit after finding the first pair
                }
            }
        }
        System.out.println("No pair found with the sum of " + result);
    }
}
