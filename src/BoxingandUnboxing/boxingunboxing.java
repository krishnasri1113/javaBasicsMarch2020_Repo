package BoxingandUnboxing;

public class boxingunboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=35;
		boxing(i);
	Integer b=new Integer(60);
	unboxing(b);
		

	}
	public  static void boxing(Integer obj)
	{
		System.out.println(obj);
	}
	public static void unboxing(int i)
	{
		System.out.println(i);
		
	}

}
