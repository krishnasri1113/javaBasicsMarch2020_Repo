
public class Revesestring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello i am siri";
        
        String[] words=str.split(" ");
        //to see the words 
        /*for(String str1:words)
        {
        	System.out.println(str1);
        }*/
        
        for(int i=words.length-1;i>=0;i--)
        {
        	System.out.print(words[i]+" ");
        }
        
        
	}

}
