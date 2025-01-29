import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEvenOdd_Positions 
{
    public static void EvenOdd(int[] arr)
    {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        System.out.println("Original Array : " + Arrays.toString(arr));
        for(int i=1; i<arr.length; i=i+2)
        {
            evenList.add(arr[i]);
        }
        for(int i=0; i<arr.length; i=i+2)
        {
            oddList.add(arr[i]);
        }

        System.out.println("Element in Even Position : " + evenList.toString());
        System.out.println("Element in Odd Position : " + oddList.toString());
    } 
    
    public static void main(String[] args) 
    {
        int[] arr = {5,8,9,3,4,5,2};
        EvenOdd(arr);
    }
}
