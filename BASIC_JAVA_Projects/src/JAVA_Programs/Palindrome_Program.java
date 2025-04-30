package JAVA_Programs;

public class Palindrome_Program {
	public static void main(String args[]) {
	
	String string="Radar";
	String Revstring="";
	int strLength = string.length();
	
	for(int i=(strLength -1);i>=0;--i)
	{
		Revstring=Revstring+string.charAt(i);
	}
	 if (string.toLowerCase().equals(Revstring.toLowerCase())) 
	 {
	
		 System.out.println(string + " is a Palindrome Strings.");
	    }
	    else {
	      System.out.println(string + " is not a Palindrome String.");
}
}
}
