package Exceptionhandling;

public class exceptionhandling {

	public static void main(String[] args) {
		int[] iarr= {1,2,3};
		//System.out.println(iarr[3]); //it wont show any error but when you
		//run only you will get exception,you have to handle that exception.
		//why do you handle the exception 
		//you should not break the remaining code.
		try
		{
			System.out.println(iarr[5]);
			System.out.println("End of try");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception found");
		}
		catch(Exception e)
		{ //there should be one catch exception is mandatory
			//this block is for handle the errors
			System.out.println(e);
		}
		System.out.println(iarr[0]);
		  
	}

}
