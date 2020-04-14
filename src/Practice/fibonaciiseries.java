package Practice;

public class fibonaciiseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1;
		System.out.println("Fibonacii series is:");
		for(int i=0;i<10;i++)
		{
			System.out.print(num1+" ");
			int sumofprevtwo=num1+num2;
			num1=num2;
			num2=sumofprevtwo;
		}

	}

}
