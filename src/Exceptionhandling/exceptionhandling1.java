package Exceptionhandling;

public class exceptionhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="siri";
		String s2=null;
	
//		System.out.println(s2.length());//when you are doing in this way you will get an exception
		//you have to handle this exception
		try
		{
		 System.out.println(s1.charAt(0));
          System.out.println(s2.length());
          
			int i=20/0;

			System.out.println(i);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("I found Exception");
			System.out.println(s1.length());
			
			
		}
		catch(NullPointerException a)
		{   
			String str="deafult";
		       s2=str;
		       System.out.println(s2);;
			System.out.println("Nullpointer exception found");
		}
		catch(ArithmeticException b)
		{
			System.out.println("Arithematic exception found");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{ 
			//.finally block will always execute weather it throw exception or not
			
			System.out.println("i am final");
		}
		System.out.println(s1.charAt(1));

	}

}
