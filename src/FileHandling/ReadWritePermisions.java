//Write a Java program to check if a file or directory has read and write permission 


package FileHandling;

import java.io.File;

public class ReadWritePermisions {

	public static void main(String[] args) {
	String spath=System.getProperty("user.dir")+"\\src\\\\FileHandling\\readwriteperm.txt";
	File myfile=new File(spath);
	if(myfile.canRead())
	{
		System.out.println(myfile.getAbsolutePath()+" can read permission");
	}
	else
	{
		System.out.println(myfile.getAbsolutePath()+" can't have read permission");
		
	}
	if(myfile.canWrite())
	{
		System.out.println(myfile.getAbsolutePath()+" can write permission");

	}
	else
	{
		System.out.println(myfile.getAbsolutePath()+" can't have write permission");

	}

	}

}
