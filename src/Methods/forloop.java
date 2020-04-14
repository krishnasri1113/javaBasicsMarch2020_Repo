package Methods;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
			System.out.println(count);
			count++;
		}
		for(int i=20;i>0;i=i-2)
		{
			System.out.print(i+" ");
		}
	System.out.println("----------------");
		
		String cars[]= {"Audi","BMW","Honda","Tesla"};
		for(String str:cars)
		{
			System.out.println(str);
		}
			

	}

}
