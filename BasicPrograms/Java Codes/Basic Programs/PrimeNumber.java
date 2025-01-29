public class PrimeNumber 
{
	public static void PrimeNumberCheck(int number)
	{
		boolean isPrime = true;
		if(number <= 1)
		{
			isPrime = false;
		}
		else
		{
			for(int i=2; i<=number/2; i++)
			{
				if(number % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println(number + " is a Prime Number");
		}
		else
		{
			System.out.println(number + " is not a Prime Number");
		}
	}


	public static void main(String[] args) 
	{
		int number = 29;
		PrimeNumberCheck(number);

		int[] numbers = {0, 1, 12, 7, 9};
		for(int num : numbers)
		{
			PrimeNumberCheck(num);
		}
		
	}

}
