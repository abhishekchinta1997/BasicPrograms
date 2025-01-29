import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {4,2,9,1};
        System.out.println("Original Array : " + Arrays.toString(array));

        int arrayLength = array.length;
        int temp = 0;

        // Ascending Order sorting
        for(int i=0; i<arrayLength; i++)
        {
            for(int j=0; j<arrayLength-i-1;j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Ascending Order : " + Arrays.toString(array));

        // Descending Order sorting
        for(int i=0; i<arrayLength; i++)
        {
            for(int j=0; j<arrayLength-i-1;j++)
            {
                if(array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Descending Order : " + Arrays.toString(array));

    }
}
