package StringExamples;

import java.util.Scanner;
public class Removeduplicatesfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter the given string");
		String str=in.nextLine();
		char[] chArray = str.toCharArray();
        String targetStr = "";

        for (char value : chArray) 
        {
           
            if (targetStr.indexOf(value) == -1) 
            {
                targetStr =targetStr+value;
            }
		
	}
        System.out.println("String after removing the duplicate chatracters :" +targetStr);


	}

}
