package StringExamples;

import java.util.Scanner;

public class Findduplicatecharactersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the string");
       String sInputDuplicateString=in.nextLine();
       char[] cDupeString=sInputDuplicateString.toCharArray();
      
        for(int firstloop=0;firstloop<cDupeString.length;firstloop++)
        {
        	 int Dupecount=1;
        boolean bDupvaluFound=false;
      if(cDupeString[firstloop]!=0)
      {
    	  for(int secloop=(firstloop+1);secloop<cDupeString.length;secloop++) 
    	  {
    		  if(cDupeString[firstloop]==cDupeString[secloop])
    		  {
    		  //System.out.println(cDupeString[secloop]);
    		  cDupeString[secloop]=0;
    		  bDupvaluFound=true;
    		  Dupecount++;
    		  }
    	  }
       }
      if(bDupvaluFound)
          System.out.println("Duplicate count of character:: "+cDupeString[firstloop]+" =="+Dupecount);

	}
      
		
}
}
