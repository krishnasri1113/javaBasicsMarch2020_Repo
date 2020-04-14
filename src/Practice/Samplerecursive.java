package Practice;

public class Samplerecursive {
        static int a=1;
	public static void main(String[] args) {
		test();

	}
	static void test()
	{
		
		System.out.println("Hello " +a);
		a++;
		if(a<=5)
		{
		test();
		}
	}
	  

}
