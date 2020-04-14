package Recursivefunction;

public class RecursionExample {
        static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func();

	}
	
	static void func()
	{
		count++;
		
		if(count<=5)
		{
			System.out.println("Hello "+count);
			func();
		}
	}

}
