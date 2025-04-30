package JAVA_Programs;

public class Reverse_String_Programs {

	public static void main(String[] args) {
		String Orgstring="Sumit";
		String Revstring="";
		
		for(int i=Orgstring.length()-1;i>=0;i--) 
		{
			Revstring=Revstring+Orgstring.charAt(i);
		}
		
		System.out.println("Orginal String is :"+ Orgstring);
		System.out.println("Reverse String is :"+ Revstring);

	}

}
