package Recursivefunction;

public class AvgScoreusingforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][]= {{60,55,70},{80,60,41}};
		average(score[0]);
		average(score[1]);
		

	}
	static void average(int scores[])
	{
		float sum=0;
		for(int marks:scores)
		{
			sum=sum+marks;
		}
		System.out.println("Average is:"+(sum/scores.length));
		
	}

}
