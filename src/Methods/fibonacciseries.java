package Methods;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers you want in sequence");
		int num=in.nextInt();
		System.out.println("The Fibonacii Series of "+num+" is");
		int num1=0,num2=1;
		for(int i=0;i<num;i++)
		{
			System.out.print(num1+" ");
			 int SumofPrevTwo=num1+num2;
			 num1=num2;
			 num2=SumofPrevTwo;
			 
		}
	
		
	}

}

