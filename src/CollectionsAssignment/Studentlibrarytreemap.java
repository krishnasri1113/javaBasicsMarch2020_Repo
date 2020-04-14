//Consider student class with name and semester attribute and Library class with lib Num and 
//total Books attributes. Store 5 Library objects as key and Student object as value in Tree Map object 
//and print the content 
package CollectionsAssignment;

import java.util.Collections;

import java.util.Map;
import java.util.TreeMap;
class Student1  {

	
	String name;
	String semester;

	Student1(String Name,String sem)
	{
		this.name=Name;
		this.semester=sem;
	}
}
class Library  implements Comparable<Library>
{
   int libnum;
   int totalbooks;
   public Library(int libnum,int totalbooks)
   {
	   this.libnum=libnum;
	   this.totalbooks=totalbooks;
   }

public int compareTo(Library l) {
	
	return this.libnum-l.libnum;
}

}

public class Studentlibrarytreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Student1 s1=new Student1("siri","sem3"); //here i am using student1  class
		  Student1 s2=new Student1("srihan","sem4");
		  Student1 s3=new Student1("santhu","sem2");
		  Student1 s4=new Student1("Anu","sem1");
		  Library l1=new Library(100,20);
		  Library l2=new Library(50,45);
		  Library l3=new Library(110,200);
		  Library l4=new Library(90,55);
		  TreeMap<Library,Student1> studentlibrary=new TreeMap<>();
		  studentlibrary .put(l1 ,s1);
		  studentlibrary.put(l2, s2);
		  studentlibrary.put(l3, s3);
		  studentlibrary.put(l4, s4);
		  
		System.out.println("LibNumber 	TotalBooks	StudentName 	Semster	");//one tab
		  for(Map.Entry<Library, Student1> entry:studentlibrary.entrySet()){    
		          
		        Library  lib=entry.getKey();
		        Student1 stdnt=entry.getValue();
		       
	     System.out.println(lib.libnum+"		"+lib.totalbooks+"		"+stdnt.name+"		"+stdnt.semester); //two tabs 
		       
		  }
		        
				 		        
				 
		        
				 
		        
		 

	}

}
