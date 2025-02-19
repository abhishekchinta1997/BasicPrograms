import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

	public static void PrintFibonacci(int terms)
	{
		int a = 0, b = 1;
		System.out.print("Fibanocci Series : ");
		for(int i=0; i<terms; i++)
		{
			System.out.print(a);
			if (i < terms) 
			{
                System.out.print(", ");
            }
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
		System.out.println();
	}

	public static int Recursive(int n)
	{
		if (n <= 1) 
		{
            return n;
        }
        return Recursive(n - 1) + Recursive(n - 2);  // Recursive call for the Fibonacci sequence
	}

	public static int[] Store_Fibonacci_To_Array(int terms)
	{
		int[] fibonacciArray = new int[terms];
		int a = 0, b = 1;
		for(int i=0; i<terms; i++)
		{
			fibonacciArray[i] = a;
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
		return fibonacciArray;
	}

	public static void Sum_Fibonacci_Array(int terms)
	{
		int[] fibonacciArray = Store_Fibonacci_To_Array(terms);
		int sum = 0;
		for(int num : fibonacciArray)
		{
			sum = sum + num;
		}
		System.out.println("Fibonacci Series (Array) : " + Arrays.toString(fibonacciArray));
		System.out.println("Sum of above " + terms + " terms : " + sum);
	}

	public static ArrayList<Integer> Store_Fibonacci_To_ArrayList(int terms)
	{
		ArrayList<Integer> fibonacciArrayList = new ArrayList<>();
		int a = 0, b = 1;

        for (int i = 0; i < terms; i++) {
            fibonacciArrayList.add(a);
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        return fibonacciArrayList;
	}

	public static void main(String[] args) 
	{
		int terms = 10;		
		PrintFibonacci(terms);
		for(int i=0; i<terms; i++)
		{
			System.out.print(Recursive(i) + " ");
		}
		System.out.println();
		System.out.println("Fibonacci Number located at position " + terms + " : " + Recursive(terms-1));

		ArrayList<Integer> fibonacciArrayList = Store_Fibonacci_To_ArrayList(terms);
		System.out.println("Fibonacci Series in (Array List) : " + fibonacciArrayList);

		Sum_Fibonacci_Array(terms);
	}
}
