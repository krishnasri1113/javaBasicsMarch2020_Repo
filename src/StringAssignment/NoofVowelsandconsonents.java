package StringAssignment;

import java.util.Scanner;

public class NoofVowelsandconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0, ccount=0,digitscount=0,spacecount=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
	     {
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
			{
				vcount++;
				
			}
			else if((ch>='a'&&ch<='z'))
			{
				ccount++;
			}
			else if((ch>='0' && ch<='9'))
			{
				digitscount++;
			}
			else if((ch==' '))
			{
				spacecount++;
			}
		}
		
		System.out.println("Number of vowels: "+vcount);
		System.out.println("Number of consonents: "+ccount);
		System.out.println("Number of digits: "+digitscount);
		System.out.println("Number of spaces: "+spacecount);
		

		

		
		

	}

}
