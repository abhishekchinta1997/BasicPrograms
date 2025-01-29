public class SwapVariables {
    
    public static void SwapWithTemp(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(("Swap with Temp : a = " + a + ", b = " + b));
    }

    public static void SwapWithoutTemp(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(("Swap without Temp : a = " + a + ", b = " + b));
    }
    
    public static void main(String[] args) {
        int a = 2, b=4;
        System.out.println(("Original Variables : a = " + a + ", b = " + b));

        SwapWithTemp(a, b);
        SwapWithoutTemp(a, b);
    }
}
