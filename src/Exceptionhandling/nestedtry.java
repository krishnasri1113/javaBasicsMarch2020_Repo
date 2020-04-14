package Exceptionhandling;

public class nestedtry {

	public static void main(String[] args) {
		try
		{
			int a=20/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Arithematic Exception found");
		}
		finally
		{
			System.out.println("finally block will always execute");
		}
		System.out.println("End of first try block");
		int a[]= {1,2,3,4};
		try {
			
			System.out.println(a[7]);
		}
		catch(Exception e)
		{
			System.out.println("Array index out of bound exception found");
		}
		finally {
			System.out.println("finally block");
			
			
		}
		System.out.println(a[1]);

		
		
	}

}
