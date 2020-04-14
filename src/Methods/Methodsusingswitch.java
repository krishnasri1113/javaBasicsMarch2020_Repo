package Methods;

import java.util.Scanner;

public class Methodsusingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter num1");
		int n1=in.nextInt();
		System.out.println("Enter num2");
		int n2=in.nextInt();
		System.out.println("Enter the CaseType");
		String str=in.next();
	
		CalculatorOperators(n1, n2, str);
	    str.equalsIgnoreCase(str);
		
		//Minus(n1,n2,str);
		

	}
	public static  void CalculatorOperators(int a, int b, String CaseType)
	{
	
		switch(CaseType)
		{
		case "add":
		  System.out.println("Addition of n1 and n2 is: "+(a+b));
		  break;
		case "subtract":
			System.out.println("Subtract of n1 and n2 is :"+(a-b));
			break;
		case "multiply":
			System.out.println("Multipli of n1 and n2 is "+(a*b));
			break;
		case "divison":
			System.out.println("divison of n1 and n2 is"+(a/b));
			break;
		default:
			System.out.println("Please provide valid Opeartion");
			break;
		
			
		
		}
	}
		
	
	
}
