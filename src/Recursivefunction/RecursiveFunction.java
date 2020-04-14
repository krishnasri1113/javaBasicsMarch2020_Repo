package Recursivefunction;

public class RecursiveFunction {
      static int a=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    test();
	}
	
	static void test()
	{
		
		System.out.println(a);
		 a++;
		if(a<5)
		{
			test();
		}
	
		
	}

}
