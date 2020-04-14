package Recursivefunction;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class AveregeScoreoftwostudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 DecimalFormat df2 = new DecimalFormat();

		double TotalScore=0;
		int count=3;
		int[][] score= {{60,55,70},{80,60,41}};
		
		for(int i=0;i<score.length;i++)
		{
			for(int j=0;j<score[i].length;j++)
			{
				TotalScore=+TotalScore+score[i][j];
			}
			   
			  double average=TotalScore/3;
			System.out.println(" Average Score of " +(i+1)+" student is " +(average));
			//System.out.printf("Average Score of "+(i+1)+" Student is %.2f"+(average));
			TotalScore=0;
			 
			 }
		

	}

}
