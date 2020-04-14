package Recursivefunction;

public class Avgscoreoftwostudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int[][] score= {{60,55,70},{80,60,41}};
		double average[]=new double[2];
		for(int i=0;i<score.length;i++) // iterating for no of rows
		{
			for(int j=0;j<3;j++)
			{
				total=total+score[i][j];
			}
			average[i]=total;
			total=0;
		}
		System.out.println("Average of first studen is "+average[0]/3);
		//System.out.println("Average of second student is "+average[1]/3);
		System.out.printf("Average of second student is %.2f",average[1]/3);

	}

}
