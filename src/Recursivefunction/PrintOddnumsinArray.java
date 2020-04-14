package Recursivefunction;

public class PrintOddnumsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evennums=0,oddnums=0;
		int[] arr= {3,8,6,14,5,17,19};
		System.out.println("Even numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				//add all even nums
				//evennums=evennums+arr[i];
			    System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println("");
		
		//System.out.println("sum of even nums:"+evennums);
		System.out.println("Odd numbers");
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2!=0)
			{
			System.out.print(arr[i]+" ");
			}
			
		}
	

	}

}
