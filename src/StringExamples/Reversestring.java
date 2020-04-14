package StringExamples;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi i am siri";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
		char[]  temp=words[i].toCharArray();
		  for(int j=temp.length-1;j>=0;j--)
			{
				System.out.print(temp[j]);
			}
			System.out.print(" ");
		}
		
		System.out.println("");
		
		String str1="Hello world";
	     char[] ch=str1.toCharArray();
	     for(int i=ch.length-1;i>=0;i--)
	     {
	    	 System.out.print(ch[i]);
	     }

	}

}
