
public class CountStringOccurence {

	public static void main(String[] args) {

		
		
		int count= countOccurences("aaanjd",'a');
		System.out.println(count);
		
	}

	private static int countOccurences(String word, char character) {
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count++;
			}
		}
		return count;
		
	}

}
