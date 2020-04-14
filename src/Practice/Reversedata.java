package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reversedata {

	public static void main(String[] args) {
		 String spathToread="C:\\Users\\krishna sri\\eclipse-workspace\\JavaBasicsMarch12\\src\\Practice\\testtoread.txt";
		String spathTowrite=System.getProperty("user.dir")+"\\src\\Practice\\testtowrite.txt";

		    try {
		      BufferedReader input = new BufferedReader(new FileReader(spathToread));
		      ArrayList list = new ArrayList();
		      String line;
		      while ((line = input.readLine()) != null) {
		        list.add(line);
		      }
		      input.close();

		      Collections.reverse(list);

		      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(spathTowrite)));
		      for (Iterator i = list.iterator(); i.hasNext();) {
		        output.println((String) i.next());
		      }
		      output.close();
		    } 
		    catch (Exception e) 
		    {
		      System.out.println(e);
		    }
		    System.out.println("=====done=====");

	}

}
