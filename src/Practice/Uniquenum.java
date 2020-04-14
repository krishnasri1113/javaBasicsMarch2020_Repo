package Practice;

public class Uniquenum {

	public static void main(String[] args) {
		int[] a= {1,1,3,2,1,2};
		for(int i=0;i<a.length;i++)
		{    boolean b=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					b=true;

				}
			}
			if(!b)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
