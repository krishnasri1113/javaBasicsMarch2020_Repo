package Methods;

public class sumof10naturalnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,sum=0;
		for(int count=1;count<=num;count++)
		{
			sum=sum+count;
			
			
		}
		System.out.println(sum);
        System.out.println("Using while loop");
		int i=0,count=1,sum1=0;
		while(num>=count)
		{
			sum1=sum1+count;
			count++;
		}
		System.out.println(sum1);

	}

}
