import java.util.Scanner;

public class largestof3usingnestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=in.nextInt();
		System.out.println("Enter b value");
		int b=in.nextInt();
		System.out.println("enter c value");
		int c=in.nextInt();
		if(a>=b) 
		{
			if(a>=c)
			{
				System.out.println("a is largest");;
			}
			else
			{
				System.out.println("c is largest");
			}
		}
		else {
			if(b>=c)
			{
				System.out.println("b is largest");
			}
			else
			{
				System.out.println("c is lagest");
			}
		}

	}

}
