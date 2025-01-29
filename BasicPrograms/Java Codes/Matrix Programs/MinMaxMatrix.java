public class MinMaxMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix = {
            {3, 5, 7},
            {2, 8, 4},
            {6, 9, 1}
        };
            
        int min = matrix[0][0]; // Assume the first element is the min
        int max = matrix[0][0]; // Assume the first element is the max
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] < min) 
                {
                    min = matrix[i][j]; // Update min
                }
                if (matrix[i][j] > max) 
                {
                    max = matrix[i][j]; // Update max
                }
            }
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
