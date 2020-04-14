package Methods;

public class Continuestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=10;i>0;i--)
		{
			if(i==6 || i==7)
				continue;
			System.out.println(i);
		}
		int count=0;
		for(int i=1;i<10;i++) 
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("count of i "+i+" and count of j "+j);
			//System.out.println(count);
				count++;
			}
			
		}
		System.out.println("Outside of the loop "+count);
	}

}
