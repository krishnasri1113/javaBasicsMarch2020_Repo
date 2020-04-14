package March16;

import java.util.Scanner;

public class Printarrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=in.nextInt();
		int[] arr=new int[length];
		System.out.println("Enter the elements");
		//to assign the value
		for(int i=0;i<length;i++)
		{
			arr[i]=in.nextInt();
		}
		//to print the value
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
