package Methods;

import java.util.Scanner;

public class CalculatorOperatorusingswitchinmethods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=in.nextInt();
		System.out.println("Enter num2");
		int num2=in.nextInt();
		System.out.println("Press 1:Add,2:subtraction,3:Multiply,4:Divison");
		int Option=in.nextInt();
		switch(Option)
		{
			case 1:
				PerformAddition(num1,num2);
				break;
			case 2:
				PerformSubtraction(num1,num2);
				break;
			case 3:
				PerformMultiply(num1,num2);
				break;
				
			case 4:
				PerformDivison(num1,num2);
				break;
				default:
					System.out.println("Please provide valid operation");
					break;
				
		}
		

	}
	
	public static void PerformAddition(int num1,int num2)
	{
		System.out.println("Addition of num1 and num2:"+(num1+num2));
	}
	public static void PerformSubtraction(int num1,int num2)
	{
		System.out.println("subtraction of num1 and num2:"+(num1-num2));
	}
	public static void PerformMultiply(int num1,int num2)
	{
		System.out.println("multiply of num1 and num2:"+(num1*num2));
	}
	public static void PerformDivison(int num1,int num2)
	{
		System.out.println("divison of num1 and num2:"+(num1/num2));
	}

}
