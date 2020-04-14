
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello i am siri";
		 int len=str.length();
		 String reversestring="";
		 for(int i=len-1;i>=0;i--)
		 {
			 reversestring=reversestring+str.charAt(i);
			 
		 }
		 System.out.println("Reverse of given string is:"+reversestring);

	}

}
