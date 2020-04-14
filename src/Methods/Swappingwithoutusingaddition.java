package Methods;

import java.util.Scanner;

public class Swappingwithoutusingaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=in.nextInt();
		System.out.println("Enter b value");
		int b=in.nextInt();
		System.out.println("Before Swapping values of a = "+a+" and b="+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping values of a = "+a+" and b="+b);

	}

}
