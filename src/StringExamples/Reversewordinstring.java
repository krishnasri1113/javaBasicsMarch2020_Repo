package StringExamples;

import java.util.Scanner;

public class Reversewordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversestring="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		String[] words=str.split(" ");
	   for(int i=0;i<words.length;i++)
		{  
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
			}
			reversestring=reversestring+reverseword+" ";
		   
		  
		}
		System.out.println(reversestring);
		

	}

}
