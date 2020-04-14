package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadandwriteProperties {

	public static void main(String[] args) throws Exception  {
	//String spath="C:\\Users\\krishna sri\\eclipse-workspace\\JavaBasicsMarch12\\src\\FileHandling\\testread.properties";
	String spathToreadprop=System.getProperty("user.dir")+"\\src\\FileHandling\\testread.properties";
	String spathTowriteprop=System.getProperty("user.dir")+"\\src\\FileHandling\\testwrite.properties";
	ReadProperties(spathToreadprop);
	WriteProperties(spathTowriteprop);
	
	}
	
	private static void ReadProperties(String spath) {
		Properties prop=new Properties();
		try {
			FileInputStream fi=new FileInputStream(spath);
			prop.load(fi);
			System.getProperties().putAll(prop);
			System.out.println("Property value of username="+System.getProperty("username"));
			System.out.println("Propery value of Password ="+System.getProperty("password"));
			System.out.println(System.getProperty("user.dir"));
			System.out.println(System.getProperty("os.name"));
			
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}

		
	}
	private static void WriteProperties(String spath) throws Exception {
	     Properties prop=new Properties();
	     FileOutputStream fos=new FileOutputStream(spath,true);
	     prop.setProperty("siri", "Developer");
	     prop.store(fos, null);
	     System.out.println(prop.getProperty("siri"));
	     
		
	}
	
}
