package BoxingandUnboxing;

public class boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=30;
		Integer j=i;
		System.out.println(j);//compiler side
		Integer k=Integer.valueOf(i);
			System.out.println(k);//human side
			int m=40;
			boxing(m);//by using methods
			
			
		
		

	}
	public static void boxing(Integer n)
	{
		System.out.println(n);
	}

}
