import java.util.Arrays;
import java.util.Random;

public class RandomNumber
{
    public static void Using_Random_Class()
    {
        Random random = new Random();
        
        int randomInt = random.nextInt(100);  // Random number between 0 and 99
        System.out.println("Random integer (0-99) using Random class: " + randomInt);
        
        boolean randomBool = random.nextBoolean();  // Generate random boolean
        System.out.println("Random boolean using Random class: " + randomBool);
        
        double randomDouble = random.nextDouble();  // Generate random double
        System.out.println("Random double (0.0 - 1.0) using Random class: " + randomDouble);
    }

    public static void Using_Math()
    {
        // Generate random number between 0.0 and 1.0
        double randomDouble = Math.random();
        System.out.println("Random double (0.0 - 1.0) using Math.random(): " + randomDouble);

        int randomInt = (int) Math.random();
        System.out.println("Random integer (0 - 1) using Math.random(): " + randomInt);
    }

    public static void Using_Ints()
    {
        Random random = new Random();
        // Generate a stream of 5 random integers between 0 and 99
        int arr[] = random.ints(5, 0, 100).toArray();
        System.out.println("Random Array of elements : " + Arrays.toString(arr));
        
    }


    public static void main(String[] args)
    {
        Using_Random_Class();
        Using_Math();
        Using_Ints();
    }
}
