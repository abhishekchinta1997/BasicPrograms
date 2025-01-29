public class Factorial 
{
    public static int Factorial_Iterative_Approach(int number)
    {
        int factorial = 1;
        for(int i=1; i<=number; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int Recursive_Iterative_Approach(int number)
    {
        if(number == 0 || number == 1)
        {
            return 1;
        }
        else
        {
            return number * Recursive_Iterative_Approach(number-1);
        }
    }

    public static void main(String[] args)
    {
        int number = 5;
        System.out.println("Factorial Iterative Approach : factorial("+number+") : " + Factorial_Iterative_Approach(number));
        System.out.println("Factorial Recursive Approach : factorial(" + number + ") : " + Recursive_Iterative_Approach(number));
    }
}
