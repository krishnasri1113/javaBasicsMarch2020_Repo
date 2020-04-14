package Javabasicsbyakshay;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A= ");
		int a=sc.nextInt();
		//System.out.println("Enter the value of B= ");
		//int b=sc.nextInt();
		int b=20;
		int c=a+b;
		System.out.println("Enter your name= ");
		String name=sc.next();
		System.out.println("Hi "+name+"!! Addition of a= "+a+" and b= "+b+" is "+c);
	}

}
