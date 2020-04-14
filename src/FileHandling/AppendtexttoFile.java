//Write a Java program to append text to an existing file 
package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendtexttoFile {

	public static void main(String[] args) throws Exception {
		String sLine;
	String spath=System.getProperty("user.dir")+"\\src\\FileHandling\\testtoread.txt";
	FileWriter fw=new FileWriter(spath,true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.newLine();
	bw.write("Welcome to TekArch");
	bw.close();
	FileReader fr=new FileReader(spath);
	BufferedReader br=new BufferedReader(fr);
	while((sLine=br.readLine())!= null)
	{
		System.out.println(sLine);
	

	}

}
}
