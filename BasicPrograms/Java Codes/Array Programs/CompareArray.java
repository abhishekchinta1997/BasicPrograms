import java.util.ArrayList;
import java.util.Arrays;

public class CompareArray {
	//compare same indexes of 2 different arrays and create another array for matching values
	public static void main(String[] args) {
		int a[] = {1,4,5,7};
		int b[] = {6,4,3,7}; 	// {4,7}
		ArrayList<Integer> arrayList =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				arrayList.add(a[i]);  //code to create another array
			}
		}
		System.out.println("Array 1 : "+Arrays.toString(a));
		System.out.println("Array 2 : "+Arrays.toString(b));
		System.out.println("Common Elements of above 2 Arrays : " + arrayList);
	}

}
