package Practice;

public class Findduplicates {

	public static void main(String[] args) {
		String s="helllo sirii";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{    
		if(a[i]!=0)
		{
			boolean bvalfound=false;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{    a[j]=0;
					bvalfound=true;
					count++;
					//System.out.print(a[i]+" ");
				}
			}
				if(bvalfound)
				{
				System.out.println("The character "+a[i]+" Occured  "+count+" times" );
				}
			}
		}
		}

	}


