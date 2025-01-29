import java.util.Arrays;

public class MinMaxArray 
{
    public static void FindMinMax(int[] arr)
    {
        System.out.println("Original Array : " + Arrays.toString(arr));
        int min=arr[0], max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Min Element : " + min);
        System.out.println("Max Element : " + max);
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,5,9,3,4,8,10};
        FindMinMax(arr);
    }   
}
