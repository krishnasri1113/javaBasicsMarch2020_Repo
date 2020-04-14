package Recursivefunction;

public class Avgoftwostudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {{60,55,70},{80,60,41}};
		double sum=0;
		int count=3;
		for(int i=0;i<score.length;i++)
		{
			for(int j=0;j<score[i].length;j++)
			{
				sum=sum+score[i][j];
			}
			double average=sum/count;
			System.out.println("Average of "+(i+1)+" student is "+average);
			sum=0;
		}

	}

}
