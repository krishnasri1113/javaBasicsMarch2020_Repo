package StringExamples;

import java.util.Scanner;

public class Duplicatecharactersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		char[] ch=str.toCharArray();
		System.out.println("Duplicate characters are");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
			  System.out.print(ch[i]+" ");
			   //count++;
			   //System.out.println();
				}
				
				
			}
			
		}
			 
		
     //System.out.println("Duplicate characters count: "+count);
	}
}


