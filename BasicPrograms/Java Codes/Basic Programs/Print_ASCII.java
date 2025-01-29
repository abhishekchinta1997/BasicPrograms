public class Print_ASCII
{

    // Method for the first example
    public static void PrintAsciiValueExample1() {
        // Characters whose ASCII value is to be found
        System.out.println("Example-1 : Variable that stores the integer value of the character");
        char ch1 = 'a';
        char ch2 = 'b';
        // Variable that stores the integer value of the character
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
    }

    // Method for the second example
    public static void PrintAsciiValueExample2() {
        // ASCII values of characters 'a' and 'b'
        int ch1 = 'a';
        int ch2 = 'b';
        System.out.println("Example-2 : ASCII values of characters 'a' and 'b'");
        System.out.println("The ASCII value of a is: " + ch1);
        System.out.println("The ASCII value of b is: " + ch2);
    }

    // using type casting
    public static void PrintAsciiValueExample3() {
        //characters whose ASCII value to be found  
        char ch1 = 'a';  
        char ch2 = 'b';  
        //casting or converting a charter into int type  
        int ascii1 = (int) ch1;  
        int ascii2 = (int) ch2;  
        System.out.println("Example-3 : using type casting");
        System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
        System.out.println("The ASCII value of " + ch1 + " is: " + ascii2);  
    }

    // Printing ASCII Values of All Characters in a Range (e.g., 'A' to 'Z')
    public static void PrintAsciiValueExample4() {
        System.out.println("Example-4 : Printing ASCII Values of All Characters in a Range (e.g., 'A' to 'Z')");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("The ASCII value of '" + c + "' is: " + (int) c);
        }  
    }

    public static void main(String[] args) 
    {
        PrintAsciiValueExample1();
        PrintAsciiValueExample2(); 
        PrintAsciiValueExample3();
        PrintAsciiValueExample4();   
    }
}
