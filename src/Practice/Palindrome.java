package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=in.nextInt();
		int reverse=0,reminder;
		int temp=n;
		while(n>0)
		{
			reminder=n%10;
			reverse=(reverse*10)+reminder;
			n=n/10;
			
		}
		if(temp==reverse)
		{
			System.out.println("num is Palindrome");
		}
		else
		{
			System.out.println("num is not palindrome");
		}
		

	}

}
