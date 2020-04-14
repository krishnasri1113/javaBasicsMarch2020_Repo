package StringExamples;

import java.util.Scanner;

public class Checkstringcontainsonlydigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		if((str.matches("[0-9]+")&&(str.length()>0)))
				{
			System.out.println("String contains only digits!");
			     } 
		       else 
		       {
			       System.out.println("String contains digits as well as other characters!");
			    }
				
		
		

	}

}
