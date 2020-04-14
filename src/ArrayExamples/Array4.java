package ArrayExamples;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the length of the array");
       int len =in.nextInt();
       int a[]=new int[len];
       //To assign the value
       System.out.println("Enter the array elements");
       for(int i=0;i<len;i++)
       {
    	  a[i]=in.nextInt();
       }
       System.out.println("Print elements");
       for(int i=0;i<len;i++)
       {
    	   System.out.print(a[i]+" ");
       }
	}

}
