package Methods;

public class Methods {

	public static void main(String[] args) {
		int a=add(10, 20);
		System.out.println(a);
		subtract(15,60);
		System.out.println(a*10);
		print0to10(0,10);
	
	}
	
	private static void print0to10(int from, int to) 
	{
	
		for(int i=from;i<=to;i++)
		{
			System.out.print(i+" ");
		}
	}

	public static int add(int a, int b)
	{
		return (a+b);
	}
	public static int subtract(int a, int b)
	{ 
		/*int sub=a-b;
	System.out.println(sub);
		return (a-b);*/
		if(a>b)
		{
			int sub=a-b;
			System.out.println(sub);
			return sub;

		}
		else
		{
			int sub=b-a;
			System.out.println(sub);
			return sub;
		}
		
	}
	public static void printname() {
		System.out.println("siri");
	}
}
		

