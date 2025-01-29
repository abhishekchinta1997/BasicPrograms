public class MultiplicationTable 
{
    // Print 5 multiplication table without using Multiply (*) operator
    public static void PrintTable(int number, int till_number)
    {
        int result = 0;
        for(int i=0; i<=till_number; i++)
        {
            result = 0;
            for(int j=1; j<=i; j++)
            {
                result = result + number;
            }
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        PrintTable(5, 10);
    }
}
