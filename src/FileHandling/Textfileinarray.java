//Write a Java program to store text file content line by line into an array. 
package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Textfileinarray {

	public static void main(String[] args) throws Exception {
		String sLine;
		String spathToread=System.getProperty("user.dir")+"\\src\\FileHandling\\testtoread.txt";
		 ArrayList<String> listofLines = new ArrayList<String>();
		 FileReader fr=new FileReader(spathToread);
		 BufferedReader br=new BufferedReader(fr);
			while((sLine=br.readLine())!= null)
			{
				listofLines.add(sLine);
				//sLine=br.readLine();
				System.out.println(sLine);
			}
			System.out.println(Arrays.toString(listofLines.toArray()));
		
		
		 

	}

}
