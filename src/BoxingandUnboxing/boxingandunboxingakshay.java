package BoxingandUnboxing;

public class boxingandunboxingakshay {
	public static void main(String[] args) {
		//boxing converting primitive data type to object
		int i=100;
		Integer j=i;
		System.out.println(j);//this is compiler side
		Integer k=Integer.valueOf(i);//this is human side
		System.out.println(k);
		int m=40;
		boxing(m);
	//by using methods
		//unboxing
		Integer obj=new Integer(45);
		int num=obj;
		  System.out.println(num);//compiler side
		  Integer obj1=new Integer(60);
		 int num1=obj1.intValue();
		 System.out.println(num1);//human side
		 Integer obj3=new Integer(50);
		 int num2=obj3;
		 System.out.println(num2);
		 
		  


		
	}
	public static void boxing(Integer k)
	{
		System.out.println(k);
	}
	public static void unboxing(int m)
	{
		System.out.println(m);
	}
	
	
}
