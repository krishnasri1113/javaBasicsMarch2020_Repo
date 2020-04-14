package StringExamples;

import java.util.Scanner;

public class Removeduplicatesfromstring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String sInputString=in.nextLine();
		//convert string to array of characters
		char[] cDupString=sInputString.toCharArray();
		for(int firstloop=0;firstloop<cDupString.length;firstloop++)
		{
			for(int secloop=(firstloop+1);secloop<cDupString.length;secloop++)
			{
				if(cDupString[firstloop]==cDupString[secloop])
				{
					sInputString=sInputString.replace(Character.toString(cDupString[firstloop]),"");
				}
			}
			
			
		}
		System.out.println("After Removing duplicate characters from string is "+sInputString);
		

	}

}
