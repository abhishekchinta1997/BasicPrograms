import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates
{
    public static void RemoveDupes_Using_ArrayList(int[] arr)
    {
        System.out.println("Original Array : " + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(!arrayList.contains(arr[i]))
            {
                arrayList.add(arr[i]);
            }
        }
        System.out.println("After Removing Duplicate Elements : " + arrayList.toString());
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 5, 6, 5, 9, 6};
        RemoveDupes_Using_ArrayList(arr);
    }
}
