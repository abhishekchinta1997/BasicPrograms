import java.util.Arrays;

public class SumOfArrayElements 
{
	//Create a Method which accepts Array and returns sum of all the elements in array 

	public static int sumArray(int[] arr)
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)  //extract every value of array and sum each value with other
		{
			sum = sum + arr[i];  //10
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int[] arr = { 1,2,3,4,5};
		System.out.println("Sum of Array " + Arrays.toString(arr) + " : " + sumArray(arr));
	}
}
