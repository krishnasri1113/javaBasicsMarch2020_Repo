package ArrayExamples;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{10,20,30},{40,50},{70,80,90}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
