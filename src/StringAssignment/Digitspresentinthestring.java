package StringAssignment;

import java.util.Scanner;

public class Digitspresentinthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
       System.out.println("Enter the String");
		String str=in.nextLine();
		char[] chArray=str.toLowerCase().toCharArray();
		int countdigits=0;
		int countcharacters=0;
	
      for(int i=0;i<chArray.length;i++)
		{
			if((int)chArray[i]>=48 && (int)chArray[i]<=57)
			{
				countdigits++;
			}
	

			else if( (int)chArray[i]>=97 &&(int)chArray[i]<=122 ||(int)chArray[i]==32 )
			{
				countcharacters++;																																																																																																																																																																																																																																																																																							countcharacters++;
			}
		
		
		}
		
		if(countdigits==chArray.length)
		{
			System.out.println("String has  only digits");
		}
		else if(countcharacters==chArray.length)
		{
			System.out.println("String has characters only");
		}
		else  
		{
			System.out.println("Strings has not only digits but also characters");
		}

	}

}
