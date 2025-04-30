package JAVA_Programs;

public class CountCharacterString {

	public static void main(String[] args) {
		String string="Become a Job Ready with Pramod Datta";
		
		int count=0;
		
		for(int i=0;i<string.length();i++)
		{
		if(string.charAt(i)!=' ')
		count++;
		
	}
  System.out.println("Total number of characters in a string: " + count);
}
}
