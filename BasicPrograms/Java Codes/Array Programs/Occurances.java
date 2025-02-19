public class Occurances {
    public static void main(String[] args) 
    {
        int[] arr = {6, 8, 11, 6, 7, 18};
        for (int i = 0; i < arr.length; i++) 
        {
            int current = arr[i];
            if(current!=Integer.MIN_VALUE)
            {
                int count = 1;
                for(int j=i+1; j < arr.length; j++)
                {
                    if(current==arr[j])
                    {
                        count++;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
                System.out.println(current + " came "+count+" times");
            }
        }
    }
}
