import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberArray
{
    // using swap
    public static void Get_Smallest_Using_Swap(int[] arr)
    {
        System.out.println("Get Smallest Number in Array using Swap");
        System.out.println("Original Array : " + Arrays.toString(arr));
        int temp = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Smallest Number : " + arr[0]);
        System.out.println("Second Smallest Number : " + arr[1]);
        System.out.println("Third Smallest Number : " + arr[2]);
        System.out.println();
    } 
    
    // using sort
    public static void Get_Smallest_Using_Sort(int[] arr)
    {
        System.out.println("Get Smallest Number in Array using Sort");
        System.out.println("Original Array : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Smallest Number : " + arr[0]);
        System.out.println("Second Smallest Number : " + arr[1]);
        System.out.println("Third Smallest Number : " + arr[3]);
        System.out.println();
    }   

    // using sort & list
    public static void Get_Smallest_Using_Sort_List(int[] arr)
    {
        System.out.println("Get Smallest Number in Array using Sort & List");
        System.out.println("Original Array : " + Arrays.toString(arr));
        Integer[] integerArray = new Integer[arr.length];  // Convert int[] to Integer[] array
        
        // Loop through and convert each element from int to Integer
        for (int i = 0; i < arr.length; i++) {
            integerArray[i] = Integer.valueOf(arr[i]);
        }

        List<Integer> list = Arrays.asList(integerArray);  // Create a List from the Integer[] array
        Collections.sort(list);
        System.out.println("Smallest Number : " + list.get(0));
        System.out.println("Second Smallest Number : " + list.get(1));
        System.out.println("Third Smallest Number : " + list.get(2));
        System.out.println();
    } 



    
    public static void main(String[] args) 
    {
        int[] arr = {5,8,6,9,3,1};
        Get_Smallest_Using_Swap(arr);
        Get_Smallest_Using_Sort(arr);
        Get_Smallest_Using_Sort_List(arr);
    }
}
