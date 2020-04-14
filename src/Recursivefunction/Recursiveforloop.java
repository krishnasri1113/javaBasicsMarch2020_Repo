package Recursivefunction;

public class Recursiveforloop {
    static int count=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         func();
	}
	
	static void func()
	{
	System.out.println("Hello "+count);
	  count++;
	  if(count<=5)
	  {
		  
		  func();
	  }
	

}

}