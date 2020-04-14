package BoxingandUnboxing;

public class unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj=new Integer(60);
		int num=obj;
		System.out.println(num);//compiler side
		Integer obj1=new Integer(50);
		int num2=obj1.intValue();
		System.out.println(num2);//by human side
		Integer obj3=new Integer(80);
		unboxing(obj3);
		

	}
	public static void unboxing(int m)
	{
		System.out.println(m);
	}

}
