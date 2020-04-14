package StringAssignment;

import java.util.Scanner;

public class RemovetheDuplicatecharactersfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          System.out.println("Enter the String");
          String str=in.nextLine();
          //convert string to array of characters
          char[] chArray=str.toLowerCase().toCharArray();
          for(int i=0;i<chArray.length;i++)
          {
        	  //boolean b=false;
        	  for(int j=(i+1);j<chArray.length;j++)
        	  {
        		  if(chArray[i]==chArray[j])
        		  {
        		  chArray[j]=0;
        		 // b=true;
        		  }
        	  }
          }
          System.out.println("After Removing Duplicates the String is");
 
          for(int i=0;i<chArray.length;i++)
          {
        	  if(chArray[i]!=0)
        	  {
        		  System.out.print(chArray[i]);
        	  }
          }
          
	}

}
