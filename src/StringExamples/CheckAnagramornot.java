package StringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=in.nextLine();
		System.out.println("Enter the second string");
		String s2=in.nextLine();
		if(checkanagram(s1,s2))
		{
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are  not anagrams");
		}

	}
	public static boolean checkanagram(String s1,String s2)
	{    //Remove all white spaces
		/*s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");*/
		//check if both length matches
		if(s1.length() != s2.length())
		{
            return false;
		}
		else
		{
			// Convert both Strings into lower case and into Character Array
            char[] ch1 = s1.toLowerCase().toCharArray();
            char[] ch2 = s2.toLowerCase().toCharArray();
            // Sort both Character Array
           Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            // Check if both arrays are equal
            return (Arrays.equals(ch1, ch2));
        }
		}
	}
	


