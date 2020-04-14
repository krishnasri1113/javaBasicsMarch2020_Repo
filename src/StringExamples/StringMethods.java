package StringExamples;

public class StringMethods {

	public static void main(String[] args) {
		// convert string to array of chracters
		String s1="Hello";
		char[] ch=s1.toCharArray();
	      for(int i=0;i<s1.length();i++)
	      {
	    	  System.out.print(ch[i]+" ");
	      }
	      //convert array of characters to string
	      System.out.println();
	      char[] ch1= {'h','e','l','l','o',' ','w','o','r','l','d'};
	      String s2=new String(ch1);
	      System.out.println(s2);
	      //another method
	      String s3=s2.valueOf(ch1);
	      System.out.println(s3);
	      //find the character index
	      String s4="Hello world";
	      System.out.println(s4.charAt(6));
	      //compare two strings
	      String s5="sai";
	      String s6="chintu";
	      System.out.println(s5.compareTo(s6));
	      System.out.println(s6.compareTo(s5));
	      System.out.println(s5==s6);//== reference the addresss,both located in diffrent address
	      System.out.println(s5.equals(s6)); //.equals describes the values;
	      //compare ignore case
	      System.out.println(s5.compareToIgnoreCase(s6));
	      char[] ch2= {'h','e','l','l','o',' ','w','o','r','l','d'};
	      String  s7="";
	      String result=s7.copyValueOf(ch2, 2, 6);
	      System.out.println(result);
	      System.out.println(s4.endsWith("hai"));
	      System.out.println(s5.equalsIgnoreCase(s6));
	      System.out.println(s4.indexOf('w',2));
	      String s8 = "Welcome to Tutorialspoint.com";
	      System.out.println(s8.replaceAll("(.*)Welcome(.*)", "Tekarch"));
	      System.out.println(s8.replaceFirst("Tutorials", "Beginnersbook"));
	      System.out.println(s4.replaceAll("(.*)Hello(.*)", "hello chintu"));
	      System.out.println(s4.substring(6));
	      System.out.println(s4.substring(0, 8));

	      

	      
	      

	}

}
