package Practice;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=in.nextInt();
		  System.out.println(factorial(n));
	}
		
		public static int factorial(int n)
		{
		
			if(n==1)
	        return 1;
			
	        else
	        return n*factorial(n-1);
			}
	
   
		}
	
	
		
		

		


