package March16;

import java.util.Scanner;

public class SumofArrayofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr=new int[10];
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the aray");
		int len=in.nextInt();
		int[] arr=new int[len];
		System.out.println("Enter  elements in the array");
		for(int i=0;i<len;i++)
		{
			 arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of 10 elements :"+sum);
		System.out.println("using foreach loop");
		int sum1=0;
		for(int arr1:arr)
		{
			sum1=sum1+arr1;
		}
		System.out.println("Sum of 10 elements in array "+sum1);

	}

}
