package Methods;

import java.util.Scanner;

public class OperationsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter the num1 value"); 
		int n1=in.nextInt();
		System.out.println("Please enter the num2 value");
		int n2=in.nextInt();
          Add(n1, n2);
		Subtract(n1, n2);
		int multi=mutiply(n1, n2);
		System.out.println("Mutiply of two num's is :"+multi);
		int divide=divison(n1,n2);
		System.out.println("Divison of two num's is :"+divide);
		}
	
	public static void Add(int a,int b)
	{
		System.out.println("Addition of two num's is:"+(a+b));
	}
	static int Subtract(int a,int b)
	{  
		int sub=a-b;
		System.out.println("Subtraction of two num's is:"+sub);
          return sub;
	}
	public static int mutiply(int a, int b)
	{
		return(a*b);
	}
	public static int divison(int a,int b)
	{
	       return(a/b);
	}

}
