import java.util.Arrays;

public class CopyArrayToAnotherArray 
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};   

        //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];   
        for(int i=0; i<arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
        System.out.println("Original Array : " + Arrays.toString(arr1));
        System.out.println("New Array (copied) : " + Arrays.toString(arr2));

    }
}
