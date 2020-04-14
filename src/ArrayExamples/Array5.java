package ArrayExamples;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner in=new Scanner(System.in);
             System.out.println("Enter the row length");
             int row=in.nextInt();
             System.out.println("Enter the col length");
             int col=in.nextInt();
             int a[][] =new int[row][col];
             System.out.println("Enter the elements");
             for(int i=0;i<3;i++)
             {
            	 for(int j=0;j<3;j++)
            	 {
            		 a[i][j]=in.nextInt();
            	 }
             }
             System.out.println("Print the elements");
             for(int i=0;i<3;i++)
             {
            	 for(int j=0;j<3;j++)
            	 {
            		System.out.print(a[i][j]+" ");
            	 }
            	 System.out.println();
             }
	}

}
