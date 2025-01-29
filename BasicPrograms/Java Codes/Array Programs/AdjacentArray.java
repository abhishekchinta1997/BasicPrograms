import java.util.Arrays;

public class AdjacentArray 
{
	//Max difference between any adjacent index in array

	public static void MaxMinDifference(int[] arr)
	{
		System.out.println("Original Array : " + Arrays.toString(arr));
		int maxDifference = Integer.MIN_VALUE;  // Initialize to the minimum possible integer value
		int minDifference = Integer.MAX_VALUE;  // Initialize to the maximum possible integer value
		for(int i=1; i<arr.length; i++)
		{
			int difference = arr[i] - arr[i-1];   // Calculate the difference between the current and previous elements
			if(difference < 0)   // If the difference is negative, convert it to positive (absolute value)
			{
				difference = -difference;
			}
			if(difference > maxDifference)  // Update the maximum difference if the current difference is greater
			{
				maxDifference = difference;
			}
			if(difference < minDifference)  // Update the maximum difference if the current difference is greater
			{
				minDifference = difference;
			}
			System.out.println("Difference between " + arr[i] + " and " + arr[i - 1] + " is: " + difference);
		}
		System.out.println("Max Difference : " + maxDifference);
		System.out.println("Min Difference : " + minDifference);
	}

	

	public static void main(String[] args) 
	{
		int[] arr = {1,4,8,15,17}; //3 4,7,2
		MaxMinDifference(arr);
	}
}
