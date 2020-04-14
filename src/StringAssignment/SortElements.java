package StringAssignment;

public class SortElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,8,23,19,45};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
						
		}
		//System.out.println(arr);
		System.out.println("Array After Bubble Sort:");

	      for(int i = 0; i < arr.length; i++)
	      {
	         System.out.print(arr[i] + " ");
	      }



	}

}
