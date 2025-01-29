public class TestPyramid {
	public static void main(String[] args) 
	{
		//	Program for Printing Pyramid Pattern in Java

		int rows = 5;
//		*
//		*  *
//		*  *   *
//		*  *   *    *
		System.out.println("Pattern - 1 : ");
		for(int i=1 ; i<=rows;i++)//outer loop prints 4 rows
		{
			for(int j=1;j<=i;j++)   // take care the logic of printing right format
			{
				System.out.print("*");
			}
			System.out.println();
		}
//			 *
//		    ***
//         *****
//        *******
//       *********
	   System.out.println("Pattern - 2 : ");
	   for(int i=1; i<=rows; i++)
	   {
		for(int j=i; j<rows; j++)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=(2*i-1); k++)
		{
			System.out.print("*");
		}
		System.out.println();
	   }
	
	}

}
