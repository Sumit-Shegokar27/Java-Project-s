package JAVA_Programs;

public class Not_Palidrome_NUmber {

	public static void main(String[] args) {

      int r,sum=0, temp;
      int num=853;
      temp=num;
      
      while(num>0)
    	  
      {
    	  r=num%10;
    	  sum=(sum*10)+r;
    	  num=num/10;
      }
      if(temp==sum)
      {
    	  System.out.println("Number is Plaindrome");
      }
      else
      {
    	  System.out.println("Number is not plaindrome");
      }

	}

}
