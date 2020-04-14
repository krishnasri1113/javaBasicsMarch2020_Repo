//Write a Java program to write and read a plain text file 
package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadandWrite {

	public static void main(String[] args) throws IOException {
		 String sLine;
  String spathToread="C:\\Users\\krishna sri\\eclipse-workspace\\JavaBasicsMarch12\\src\\FileHandling\\testtoread.txt";
  String spathTowrite="C:\\Users\\krishna sri\\eclipse-workspace\\JavaBasicsMarch12\\src\\FileHandling\\testToWrite.txt";
  ReadFile(spathToread);
  WriteFile(spathTowrite); 
  }

	private static void ReadFile(String spath)  {
		// TODO Auto-generated method stub
		 String sLine;
		try {
			FileReader fr=new FileReader(spath);
			BufferedReader br=new BufferedReader(fr);
			while((sLine=br.readLine())!= null)
			{
					System.out.println(sLine);
					if(sLine.contains("siri"))
					{
						System.out.println("I found siri in texfile");
					}
					//String sLine1=sLine.replace("siri", "santhu");
					//System.out.println(sLine1);
		
			}
			br.close();
		}
					
				
		 catch (Exception e) 
		  {
		   System.out.println(e);
		}
				
	}
	private static void WriteFile(String spath)  {
		try {
			FileWriter fw=new FileWriter(spath,true);
			BufferedWriter bw=new BufferedWriter(fw);
		    bw.write("Hello");
			bw.newLine();
			bw.write("I am Siri");
			bw.newLine();
			bw.write("How are you,My number is 1234");
			bw.newLine();
			//bw.write(1234);
			bw.close();
		} 
		catch (Exception e) {
		
		System.out.println(e);
		}
		System.out.println("success");
		
	}

}
