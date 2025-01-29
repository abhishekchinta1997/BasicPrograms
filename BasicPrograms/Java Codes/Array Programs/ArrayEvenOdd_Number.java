import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayEvenOdd_Number
{
    public static void EvenOdd(int[] arr)
    {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        System.out.println("Original Array : " + Arrays.toString(arr));
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                evenList.add(arr[i]);
            }
            else
            {
                oddList.add(arr[i]);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList);
        System.out.println("Even Elements : " + evenList.toString());
        System.out.println("Odd Elements : " + oddList.toString());
    } 
    
    public static void main(String[] args) 
    {
        int[] arr = {5,8,9,3,4,5,2};
        EvenOdd(arr);
    }
}
