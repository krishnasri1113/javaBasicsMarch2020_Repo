package BoxingandUnboxing;

public class boxingandunboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one way of boxing and unboxing
		int i=50;
		boxingmethod(i);//boxing converting primitive data type to object is called boxing
		//Integer j=20;//assigning primitive value to Integer object
		//unboxing
		Integer objm=new Integer(70);
		unboxingmethod(objm);
		//second way of boxing
		Integer num=20;
		num=i;
		System.out.println(num);
		//second way of unboxing
		Integer objnum1=new Integer(35);
		int num2=objnum1;
		System.out.println(num2);
		

	}
	
	public static void  boxingmethod(Integer k)
	{
		System.out.println(k);
	}
	public static void unboxingmethod(int k)
	{
		System.out.println(k);
	}

}
