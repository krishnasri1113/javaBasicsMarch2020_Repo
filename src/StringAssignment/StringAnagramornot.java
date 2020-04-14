package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=in.nextLine();
		System.out.println("Enter second string");
		String str2=in.nextLine();
		if(checkanagram(str1,str2))
		{
	      System.out.println(str1+" and"+str2+" are anagrams");
		}
		else
		{
			System.out.println(str1+" and "+str2+" are not anagrams");
		
		}
		

	}
	public static boolean checkanagram(String s1,String s2)
	{
		//checking the lengths
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{    //conver string to array of characters
			char[] chArr1=s1.toLowerCase().toCharArray();
			char[] chArr2=s2.toLowerCase().toCharArray();
			//sort the charcter array
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			return Arrays.equals(chArr1, chArr2);
		}
	}

}

