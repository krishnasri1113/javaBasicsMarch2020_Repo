package Methods;

import java.util.Scanner;

public class methodsusingswitchcase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter num1");
		int n1=in.nextInt();
		System.out.println("Enter num2");
		int n2=in.nextInt();
		System.out.println("Enter the CaseType");
		String str=in.next();
		//str.equalsIgnoreCase();
	     Add(n1, n2, str);

	     Sub(n1, n2, str);
	     multiply(n1, n2, str);
	     divison(n1, n2, str);
     
	}
	public static int Add(int a,int b,String CaseType)
	{
		switch(CaseType)
		{
		case"add":
			int result=a+b;
			System.out.println("Addition of n1 and n2 is:"+result);
			break;
			
		}
		return (a+b);
	
	}
	public static int Sub(int a,int b,String CaseType)
	{
		switch(CaseType)
		{
		case"subtract":
			int result=a-b;
			System.out.println("subtaction of n1 and n2 is:"+result);
			break;
			
		}
		return (a-b) ;
	}
	public static int multiply(int a,int b,String CaseType)
	{
		switch(CaseType)
		{
		case"multiply":
			int result=a*b;
			System.out.println("multiply of n1 and n2 is:"+result);
			break;
			
		}
		return (a*b) ;
	}
	public static int divison(int a,int b,String CaseType)
	{
		switch(CaseType)
		{
		case"divison":
			int result=a/b;
			System.out.println("divison of n1 and n2 is:"+result);
			break;
			
		}
		return (a/b) ;
	}
}
