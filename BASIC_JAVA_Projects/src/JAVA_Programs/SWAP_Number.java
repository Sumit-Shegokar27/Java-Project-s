package JAVA_Programs;

import java.util.Scanner;

public class SWAP_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of x and y ");
		Scanner scr=new Scanner(System.in);
		 int x= scr.nextInt();
		 int y= scr.nextInt();
		 System.out.println("Before Swapping the numbers :"+x+ " "+y);
		 
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("After Swapping the number :"+x+" "+y);

	}

}
