package Methods;

import java.util.Scanner;

public class Sumof10naturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the num");
		int num=in.nextInt();
	     int sum=0,count=1;
		while(num>=count)
		{
			sum=sum+count;
			count++;
			
		}
		System.out.println("Sum of 10 natural num's is :"+sum);

		
	}

}
