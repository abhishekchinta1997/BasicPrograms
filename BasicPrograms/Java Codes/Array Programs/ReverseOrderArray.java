import java.util.ArrayList;
import java.util.Arrays;

public class ReverseOrderArray 
{
    public static ArrayList<Integer> PrintReverseOrderArray(int[] arr)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=arr.length-1; i>=0; i--)
        {
            arrayList.add(arr[i]);
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Reversed Array : " + arrayList.toString());
        return arrayList;
    }
    public static void main(String[] args) 
    {
        // reverse array
        int[] arr = {1, 2, 3, 4, 5};
        PrintReverseOrderArray(arr);
        System.out.println();
        
        int number = 12345;   // convert number to array and reverse it
        System.out.println("Convert number to array and reverse it");
        System.out.println("Original Number : " + number);
        String numString = Integer.toString(number); // convert to string
        
        int[] arr1 = new int[numString.length()];  // take new array
        for(int i=0; i<numString.length(); i++)   // insert each char to array
        {
            arr1[i] = Character.getNumericValue(numString.charAt(i));  // Convert each char to an int
        }

        ArrayList<Integer> arrayList = PrintReverseOrderArray(arr1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arrayList.size(); i++)
        {
            sb.append(arrayList.get(i));
        }
        int result = Integer.parseInt(sb.toString());
        System.out.println("Reversed Number : " + result);
    }
}
