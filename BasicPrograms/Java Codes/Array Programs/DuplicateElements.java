import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Find duplicates of an Array

public class DuplicateElements
{
    public static void FindDuplicates_Normal(int[] arr)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    arrayList.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println("Using normal : ");
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Duplicate Elements : " + arrayList.toString());
        System.out.println();
    }

    public static void FindDuplicates_Sort(int[] arr)
    {
        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] == arr[i+1])
                {
                    arrayList.add(arr[i]);
                }
        }
        System.out.println("Using Sort : ");
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Duplicate Elements : " + arrayList.toString());
        System.out.println();
    }

    public static void FindDuplicates_HashSet(int[] arr)
    {
        HashSet<Integer> seen = new HashSet<>();  
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr)
        {  
            if (!seen.add(num)) 
            {  
                duplicates.add(num);
            }  
        }
        System.out.println("Using HashSet : ");
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Duplicate Elements : " + duplicates.toString());
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 5, 6, 5, 9, 6};
        FindDuplicates_Normal(arr);
        FindDuplicates_Sort(arr);
        FindDuplicates_HashSet(arr);
    }    
}
